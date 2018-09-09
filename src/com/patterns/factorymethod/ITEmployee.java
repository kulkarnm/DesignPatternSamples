package com.patterns.factorymethod;

public class ITEmployee extends Employee {
    public ITEmployee(String name) {
        super(name);
    }

    public void manageWork(){
        System.out.println("Managing software development");
    }

} 
