package com.curso.gestionpostgresql.services;

import com.curso.gestionpostgresql.model.Student;
import com.curso.gestionpostgresql.model.Subject;
import com.curso.gestionpostgresql.repository.StudentRepository;
import com.curso.gestionpostgresql.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImp implements SubjectService{

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> listAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }
}
