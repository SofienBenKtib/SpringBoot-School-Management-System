package com.sofien.sms.project.services;

import com.sofien.sms.project.entity.Professor;
import com.sofien.sms.project.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    //Save 1 professor
    public Professor saveProfessor(Professor professor){
        return professorRepository.save(professor);
    }

    //Save a list of professors
    public List<Professor> saveProfessors(List<Professor> professorList){
        return professorRepository.saveAll(professorList);
    }

    //Get all the professors
    public List<Professor> getProfessors(){
        return professorRepository.findAll();
    }

    //Get a professor by Id
    public Professor getProfessorById(int id){
        return professorRepository.findById(id).orElse(null);
    }

    //Get a professor by Name
    public Professor getProfessorByName(String name){
        return professorRepository.findByName(name);
    }

    //Delete a professor by Id
    public String deleteProfessorById(int id){
        professorRepository.deleteById(id);
        return "The professor with the id : " + id + " has been removed from the DB";
    }

    //Deleting all the professors
    public String deleteAllProfessors(){
        professorRepository.deleteAll();
        return "All the professors have been removed from the DB";
    }

    //Updating a professor
    public Professor updateProfessor(Professor professor){
        Professor existingProfessor=professorRepository.findById(professor.getId()).orElse(null);
        existingProfessor.setName(professor.getName());
        existingProfessor.setEmail(professor.getEmail());
        existingProfessor.setPhoneNumber(professor.getPhoneNumber());
        existingProfessor.setMainSubject(professor.getMainSubject());
        return professorRepository.save(professor);
    }
}
