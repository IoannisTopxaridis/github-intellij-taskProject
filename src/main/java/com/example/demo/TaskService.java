// where the actions get executed
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// @Service Takes data and apply rules
@Service
public class TaskService {
    // @Autowired makes connections between the TaskRepository bean and the variable taskRepository
    @Autowired
    private TaskRepository taskRepository;

    // Reads all rows from the task table.
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Saves a new task or updates an existing one in the database
    public void addTask(Task newTask) {
        taskRepository.save(newTask);
    }

    // Deletes a task based on its id from the database.
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

// Bean is an object that is created, managed, and assembled by the Spring Framework instead of by you using the "new" keyword