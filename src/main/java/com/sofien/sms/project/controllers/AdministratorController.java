package com.sofien.sms.project.controllers;

import com.sofien.sms.project.entity.Administrator;
import com.sofien.sms.project.services.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;

    @PostMapping("/addAdmin")
    public Administrator addAdmin(Administrator administrator) {
        return administratorService.saveAdministrator(administrator);
    }

    @PostMapping("/addAdmins")
    public List<Administrator> addAdmins(List<Administrator> administratorList) {
        return administratorService.saveAdministrators(administratorList);
    }

    @GetMapping("/admins")
    public List<Administrator> findAllAdmins(){
        return administratorService.getAdministrators();
    }

    @GetMapping("/admin/id/{id}")
    public Administrator findAdminById(@PathVariable int id){
        return administratorService.getAdminById(id);
    }

    @GetMapping("/admin/name/{name}")
    public Administrator findAdminByName(@PathVariable String name){
        return administratorService.getAdminByName(name);
    }

    @PutMapping("/admin/update")
    public Administrator updateAdmin(@RequestBody Administrator administrator){
        return administratorService.updateAdmin(administrator);
    }

    @DeleteMapping("/admins/deleteAll")
    public String deleteAdmins(){
        return administratorService.deleteAllAdmins();
    }

    @DeleteMapping("/admin/delete/{id}")
    public String deleteAdminById(@PathVariable int id){
        return administratorService.deleteAdminById(id);
    }

}
