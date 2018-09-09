package com.patterns.factorymethod;

public class AccEmployee extends Employee {
    public AccEmployee(String name) {
        super(name);
    }

    public void manageWork(){
        System.out.println("Manage company accounts");
    }
} 
