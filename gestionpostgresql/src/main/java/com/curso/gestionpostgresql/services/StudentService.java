package com.curso.gestionpostgresql.services;

import com.curso.gestionpostgresql.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> listAllStudents();
    Student saveStudent(Student student);
    boolean findStudentById(Student student);
}
