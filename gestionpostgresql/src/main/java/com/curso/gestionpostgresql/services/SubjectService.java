package com.curso.gestionpostgresql.services;

import com.curso.gestionpostgresql.model.Student;
import com.curso.gestionpostgresql.model.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> listAllSubjects();
    Subject saveSubject(Subject subject);

}
