package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Λέμε στο Spring: "Αυτό το αρχείο μιλάει απευθείας με τον πίνακα στη MySQL"
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Κληρονομεί αυτόματα έτοιμες μεθόδους όπως: save(), findAll(), deleteById(), κλπ.!
}