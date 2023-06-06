package com.batchexample.CSVtoDatabase.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    private int id;

    private String name;
    private int salary;
    private String dept;
    private Date time;
}
