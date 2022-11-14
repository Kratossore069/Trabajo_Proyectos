package com.portfolio.PersonalBackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastname;
    private int age;

    @ManyToOne
    @JoinColumn (name="id_country")
    private Country country;

    @ManyToOne
    @JoinColumn (name="id_state")
    private State state;
}
