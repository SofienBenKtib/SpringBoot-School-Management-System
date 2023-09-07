package com.sofien.sms.project.controllers;

import com.sofien.sms.project.entity.Professor;
import com.sofien.sms.project.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @PostMapping("/addProfessor")
    public Professor addProfessor(Professor professor){
        return professorService.saveProfessor(professor);
    }

    @PostMapping("/addProfessors")
    public List<Professor> addProfessors(List<Professor> professorList){
        return professorService.saveProfessors(professorList);
    }

    @GetMapping("/professors")
    public List<Professor> findAllProfessors(){
        return professorService.getProfessors();
    }

    @GetMapping("/professor/id/{id}")
    public Professor findProfessorById(@PathVariable int id){
        return professorService.getProfessorById(id);
    }

    @GetMapping("/professor/name/{name}")
    public Professor findProfessorByName(@PathVariable String name){
        return professorService.getProfessorByName(name);
    }

    @PutMapping("/professor/update")
    public Professor updateProfessor(@RequestBody Professor professor){
        return professorService.updateProfessor(professor);
    }

    @DeleteMapping("/professors/deleteAll")
    public String deleteProfessors(){
        return professorService.deleteAllProfessors();
    }

    @DeleteMapping("/professor/delete/{id}")
    public String deleteProfessor(@PathVariable int id){
        return professorService.deleteProfessorById(id);
    }
}
