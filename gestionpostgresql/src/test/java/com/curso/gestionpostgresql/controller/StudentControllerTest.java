package com.curso.gestionpostgresql.controller;

import com.curso.gestionpostgresql.model.Student;
import com.curso.gestionpostgresql.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentControllerTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void listAllStudents() {
    }

    @Test
    void saveStudent() {
        Student newStudent = new Student(1, "Pedro", "pedro.com");
        Student saveStudent = studentRepository.save(newStudent);
        Optional<Student> studentOpt = studentRepository.findById(saveStudent.getId());
        assertThat(studentOpt.isPresent()).isTrue();
    }
}