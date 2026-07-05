package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @Entity is a blueprint for a database table marker
@Entity
public class Task {

    // @Id primary key,unique row identifier
    @Id
    // @GeneratedValue the database automatically generates numbers with new tasks so you don't have to set a default value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String status;

    // Constructor acts as a blank template so Hibernate
    public Task() {
    }

    // Constructor to create a new Task object with data
    public Task(String title, String status) {
        this.title = title;
        this.status = status;
    }

    // Getters to read the private values in this object
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }
}

// JPA defines the annotation @Entity
//
// Hibernate reads that annotation and builds/talks to your MySQL database so you don't have to write raw SQL strings in your Java code

// JPA (Java Persistence API) is the "Rulebook"
// JPA is not an actual piece of software
// it is a specification (a set of guidelines and rules) defined by Java


// Hibernate is the "Worker" (The ORM = Object-Relational Mapper)
// Because JPA is just a rulebook, you need an actual engine to do the work
// Hibernate is the actual framework that implements the JPA rules.

