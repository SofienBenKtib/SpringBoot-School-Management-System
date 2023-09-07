package com.sofien.sms.project.controllers;

import com.sofien.sms.project.entity.Student;
import com.sofien.sms.project.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> studentList) {
        return studentService.saveStudents(studentList);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/student/id/{id}")
    public Student findStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/student/name/{name}")
    public Student findStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @PutMapping("/student/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/students/deleteAll")
    public String deleteStudents() {
        return studentService.deleteAllStudents();
    }

    @DeleteMapping("/student/delete/{id}")
    public String deleteStudentById(@PathVariable int id) {
        return studentService.deleteStudentById(id);
    }
}
