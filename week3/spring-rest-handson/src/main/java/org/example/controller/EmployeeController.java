package org.example.controller;

import org.example.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot REST API";
    }

    @GetMapping("/employee")
    public Employee getEmployee() {
        return new Employee(101, "Sathya", "Developer", 65000);
    }
}