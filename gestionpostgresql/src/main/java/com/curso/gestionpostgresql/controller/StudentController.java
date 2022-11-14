package com.curso.gestionpostgresql.controller;

import com.curso.gestionpostgresql.model.Student;
import com.curso.gestionpostgresql.services.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImp studentServiceImp;

    @GetMapping
    public List<Student> listAllStudents(){
        return studentServiceImp.listAllStudents();
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        return studentServiceImp.saveStudent(student);
    }
}
