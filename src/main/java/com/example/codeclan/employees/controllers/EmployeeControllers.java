package com.example.codeclan.employees.controllers;

import com.example.codeclan.employees.models.Employee;
import com.example.codeclan.employees.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeControllers {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
