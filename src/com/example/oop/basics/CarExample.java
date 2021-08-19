package com.example.oop.basics;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public Car(){
        this.manufacturer = "unknown";
    }

    public Car(String manufacturer, String name, int year, String color, float topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public void printInfo() {
        System.out.println( this.manufacturer + " " + this.name + " " + this.year);
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car peugeot = new Car();
        peugeot.manufacturer = "Peugeot";
        peugeot.name = "307";
        peugeot.color = "Blue";
        peugeot.year = 2004;
        peugeot.topSpeed = 220.0f;

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "Red";
        chevrolet.year = 2015;
        chevrolet.topSpeed = 290.0f;

        peugeot.printInfo();
        chevrolet.printInfo();

        Car dodge = new Car("Dodge", "Viper",
                1997, "Red", 290.0f);
        dodge.printInfo();
    }
}
