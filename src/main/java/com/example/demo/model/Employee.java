package com.example.demo.model;

public class Employee {
    // class instance variables
    private Long id;
    private String name;
    private String department;

    // the constructor 
    public Employee(Long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getName() { return name;}
    public void setName(String name) { this.name = name;}

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
 } 
