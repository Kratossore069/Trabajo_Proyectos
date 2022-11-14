package com.portfolio.PersonalBackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "userdatabase")
public class UserDatabase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String password;
}
