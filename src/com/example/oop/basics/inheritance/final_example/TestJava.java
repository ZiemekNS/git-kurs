package com.example.oop.basics.inheritance.final_example;

class Employee {
    String name;
    String surname;
    String jobTitle;
    float salary;
}

class Manager extends Employee {
    String responsibility;
}

class Director extends Manager {
    String department;
}

class vicePresident extends Director {

}

final class CEO extends vicePresident {
    String companyName;
}

/*class Something extends CEO{

}*/

public class TestJava {
    public static void main(String[] args) {
        CEO ceo = new CEO();

    }
}
