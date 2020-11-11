package com.projectmuthyam.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    private int id;

    private String name;
    private String email;

}
