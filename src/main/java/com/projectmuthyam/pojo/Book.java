package com.projectmuthyam.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;

}
