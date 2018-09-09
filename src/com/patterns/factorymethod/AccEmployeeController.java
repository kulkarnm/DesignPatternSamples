package com.patterns.factorymethod;

public class AccEmployeeController extends EmployeeController  {
    @Override
    public Employee createEmployee(String name) {
        return new AccEmployee(name);
    }
} 
