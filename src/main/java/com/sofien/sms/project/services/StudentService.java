package com.sofien.sms.project.services;

import com.sofien.sms.project.entity.Student;
import com.sofien.sms.project.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    //Save 1 student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    //Save a list of students
    public List<Student> saveStudents(List<Student> studentsList) {
        return studentRepository.saveAll(studentsList);
    }

    //Get all the students
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    //Get a student by id
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    //Get a student by name
    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    //Delete a student by his id
    public String deleteStudentById(int id) {
        studentRepository.deleteById(id);
        return "The student with the id :" + id + " has been successfully deleted";
    }

    //Delete all the students
    public String deleteAllStudents() {
        studentRepository.deleteAll();
        return "All the students have been deleted from the Database";
    }

    //Update a student
    public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setPhoneNumber(student.getPhoneNumber());
        existingStudent.setCurrentGrade(student.getCurrentGrade());
        return studentRepository.save(student);
    }

}
