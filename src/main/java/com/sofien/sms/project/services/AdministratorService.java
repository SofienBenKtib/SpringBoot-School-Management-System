package com.sofien.sms.project.services;

import com.sofien.sms.project.entity.Administrator;
import com.sofien.sms.project.repositories.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorService {
    @Autowired
    AdministratorRepository administratorRepository;

    //Save 1 Admin
    public Administrator saveAdministrator(Administrator administrator){
        return administratorRepository.save(administrator);
    }

    //Save a list of Admins
    public List<Administrator> saveAdministrators(List<Administrator> administratorList){
        return administratorRepository.saveAll(administratorList);
    }

    //Get all the admins
    public List<Administrator> getAdministrators(){
        return administratorRepository.findAll();
    }

    //Get admin by Id
    public Administrator getAdminById(int id){
        return administratorRepository.findById(id).orElse(null);
    }

    //Get an admin by name
    public Administrator getAdminByName(String name){
        return administratorRepository.findByName(name);
    }

    //Delete all the admins
    public String deleteAllAdmins(){
        administratorRepository.deleteAll();
        return "All the admins have been removed from the DB";
    }

    //Delete an admin by Id
    public String deleteAdminById(int id){
        administratorRepository.deleteById(id);
        return "The admin with the id : " + id + " has been removed from the DB";
    }

    //Updating an admin
    public Administrator updateAdmin(Administrator administrator){
        Administrator existingAdmin=administratorRepository.findById(administrator.getId()).orElse(null);
        existingAdmin.setName(administrator.getName());
        existingAdmin.setEmail(administrator.getEmail());
        existingAdmin.setPhoneNumber(administrator.getPhoneNumber());
        existingAdmin.setRole(administrator.getRole());
        return administratorRepository.save(administrator);
    }
}
