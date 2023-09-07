package com.sofien.sms.project.repositories;

import com.sofien.sms.project.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator,Integer> {
    Administrator findByName(String name);
}
