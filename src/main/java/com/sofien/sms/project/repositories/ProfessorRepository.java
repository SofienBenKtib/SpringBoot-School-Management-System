package com.sofien.sms.project.repositories;

import com.sofien.sms.project.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {
}
