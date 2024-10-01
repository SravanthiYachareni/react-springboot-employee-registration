package com.sravs.controller;

import com.sravs.dto.EmployeeDto;
import com.sravs.model.Employee;
import com.sravs.repository.EmployeeRepo;
import com.sravs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping
    public EmployeeDto createEmployee(@RequestBody  EmployeeDto employeeDto){
        return  employeeService.createEmployee(employeeDto);
    }
    @GetMapping("{id}")
    public  EmployeeDto getEmployeeId(@PathVariable ("id") Long id){
        return   employeeService.getEmployeeId(id);
    }
}
