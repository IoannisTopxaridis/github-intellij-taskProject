//use the database with getting or placing something from the inside
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository Data layer component that manages connection with the actual database.
// extending TaskRepository interface with JpaRepository gets pre-built methods like findAll() save() deleteById() findBy() count ()
// JpaRepository<Task, Long> ==> Task: the Entity Long: the ID Type

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}