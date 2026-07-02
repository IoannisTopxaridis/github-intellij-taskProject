package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/api/all-tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/api/create-task")
    public String createTask(@RequestBody Task newTask) {

        taskService.addTask(newTask);
        return "Το Task δημιουργήθηκε με επιτυχία στη MySQL!";
    }

    @DeleteMapping("/api/delete-task/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "To Task με ID " + id + " διαγράφηκε με επιτυχία από τη MySQL!";
    }

}