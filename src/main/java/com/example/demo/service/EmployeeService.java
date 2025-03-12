package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    
    public List<Employee> getEmployees() {
        return List.of(
            new Employee(1L, "Alice", "Engineering"),
            new Employee(2L, "Bob", "Accounting")
        );
    }
}
