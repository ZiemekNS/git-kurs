package com.example.oop.basics.inheritance.abstract_classes;

public class Abstractexample {
    public static void main(String[] args) {

        Employee worker1 = new Employee("Adam","Kowalski",32);
        worker1.printInfo();

        Manager manager = new Manager("Olek","Zend",35,"RnD");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());

    }
}
