package com.sravs.controller;

import com.sravs.model.Employee;
import com.sravs.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;
    @GetMapping
    public List<Employee> getAll(){
        return  employeeRepo.findAll();
    }
}
