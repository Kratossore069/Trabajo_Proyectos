package com.curso.gestionpostgresql.controller;

import com.curso.gestionpostgresql.model.Subject;
import com.curso.gestionpostgresql.services.SubjectServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectServiceImp subjectServiceImp;

    @GetMapping
    public List<Subject> listAllSubjects(){
        return subjectServiceImp.listAllSubjects();
    }

    @PostMapping("/save")
    public Subject saveSubject(@RequestBody Subject subject){
        return subjectServiceImp.saveSubject(subject);
    }
}
