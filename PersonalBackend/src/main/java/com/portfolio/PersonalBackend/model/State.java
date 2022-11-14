package com.portfolio.PersonalBackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_country")
    private Country country;

    private String name;
}
