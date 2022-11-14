package com.curso.gestionpostgresql.repository;

import com.curso.gestionpostgresql.model.Student;
import com.curso.gestionpostgresql.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
