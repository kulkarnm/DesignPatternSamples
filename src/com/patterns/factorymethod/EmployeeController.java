package com.patterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class EmployeeController {
    private List<Employee> employees;
    public EmployeeController(){
        employees= new ArrayList<>();
    }
    public void addEmployee(String name)	{
        //…accept name of a new employee
        // Employee emp = new Employee(name)
        Employee emp = createEmployee(name);
        employees.add(emp);
        //…
    }
    public abstract Employee createEmployee(String name);
    public void printEmployees(){
        for(Employee e: employees){
            System.out.println(" Emaployee: " + e.getName());
        }
    }
} 
