//takes request and gives it to the right class-object. Its only job is to handle web traffic
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

// @RestController marks this class as an API Controller that handles web requests and automatically converts data into JSON format
@RestController
public class HelloController {

    @Autowired
    private TaskService taskService;

    // @GetMapping listens for HTTP GET requests at "/api/all-tasks"
    // returns the list of tasks that are autoconverted into JSON
    // reads data
    @GetMapping("/api/all-tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // @PostMapping send information to be saved.
    // adding new information that will result in a change in the database
    // @RequestBody takes the JSON data from the frontend and converts it back into a Java Task object
    @PostMapping("/api/create-task")
    public String createTask(@RequestBody Task newTask) {
        taskService.addTask(newTask);
        System.out.println("Το Task δημιουργήθηκε με επιτυχία στη MySQL!");
        return "Created";
    }

    // @PostMapping listens for HTTP DELETE requests at "/api/delete-task/{id}"
    // @PathVariable takes the {id} and places it into Long id variable
    @DeleteMapping("/api/delete-task/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        System.out.println("To Task με ID " + id + " διαγράφηκε με επιτυχία από τη MySQL!");
        return "Deleted";
    }

}

// @RestController combination of two other annotations: @Controller and @ResponseBody
// @Controller (Traffic Controller) a place where web requests come in
// @ResponseBody (JSON Translator) raw data takes Lists runs it through Jackson (a JSON library) and converts it into a JSON string that the browser can understand.