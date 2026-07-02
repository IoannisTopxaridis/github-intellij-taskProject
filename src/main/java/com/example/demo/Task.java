package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // 1. Ιδιότητες (Πεδία) της εργασίας μας
    private String title;
    private String status; // Μπορεί να είναι "Todo", "InProgress", "Completed"

    public Task() {
    }
    // 2. Constructor (Κατασκευαστής) - Για να φτιάχνουμε εύκολα ένα νέο Task
    public Task(String title, String status) {
        this.title = title;
        this.status = status;
    }

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