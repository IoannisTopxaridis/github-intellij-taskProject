package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public List<Task> getAllTasks() {

        return taskRepository.findAll();
    }

    public void addTask(Task newTask) {
        taskRepository.save(newTask);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}