package com.patterns.factorymethod;

public class FactoryMethodTest {
    public static  void main(String[] args){
        ITEmployeeController itEmployeeController= new ITEmployeeController();
        itEmployeeController.addEmployee("Mandar");
        itEmployeeController.addEmployee("Rahul");
        System.out.println("####IT Employees###");
        itEmployeeController.printEmployees();

        AccEmployeeController accEmployeeController= new AccEmployeeController();
        accEmployeeController.addEmployee("Deepak");
        accEmployeeController.addEmployee("Mehul");
        System.out.println("####ACC Employees###");
        accEmployeeController.printEmployees();
    }
} 
