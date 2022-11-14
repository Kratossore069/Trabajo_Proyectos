package com.curso.gestionpostgresql.services;

import com.curso.gestionpostgresql.model.Student;
import com.curso.gestionpostgresql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> listAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    /**
     * FUNCTION SEARCH STUDENT BY ID SHOWS IF
     * STUDENT EXISTS OR NOT
     * @param student
     * @return true or false
     */
    @Override
    public boolean findStudentById(Student student) {
        Optional<Student> findStudent = studentRepository.findById(student.getId());
        return findStudent
                .filter(people -> people.getId() == student.getId())
                .isPresent();
    }
}
