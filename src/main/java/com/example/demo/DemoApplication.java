package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication makes this java class to a Spring Boot application
//and configures the app and searches for components (controller, services) and launches the server
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Starts the Spring Boot framework and runs the application
        SpringApplication.run(DemoApplication.class, args);
    }
}
