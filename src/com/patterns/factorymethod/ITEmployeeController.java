package com.patterns.factorymethod;

public class ITEmployeeController extends EmployeeController {
    @Override
    public Employee createEmployee(String name) {
        return new ITEmployee(name);
    }
}
