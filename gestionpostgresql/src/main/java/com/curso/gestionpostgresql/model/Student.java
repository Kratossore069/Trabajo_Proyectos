package com.curso.gestionpostgresql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;

    private String name;
    private String email;

    @OneToMany
    private List<Subject> subject;

    public Student(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
