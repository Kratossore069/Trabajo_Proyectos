package com.portfolio.PersonalBackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
