package com.sofien.sms.project.repositories;

import com.sofien.sms.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByName(String name);
}
