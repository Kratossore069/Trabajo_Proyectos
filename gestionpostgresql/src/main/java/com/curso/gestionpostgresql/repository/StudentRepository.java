package com.curso.gestionpostgresql.repository;

import com.curso.gestionpostgresql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // @Query("select name from student where id=?1")
//    Student findByStudentId(Integer id);
}
