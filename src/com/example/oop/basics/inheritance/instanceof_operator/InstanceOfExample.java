package com.example.oop.basics.inheritance.instanceof_operator;

class Animal {
    protected String name;
    protected float weight; //kg
    protected int numLegs;
}

class Dog extends Animal {
    protected void bark() {
        System.out.println("Dog barks!");
    }
}

class Bird extends Animal {
    protected void fly() {
        System.out.println("Bird flies!");
    }
}

class Parrot extends Bird {
    protected void learnWord() {
        System.out.println("Parrot learned word!");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        boolean result = dog instanceof Animal;
        System.out.println(result);

        Animal animal = new Animal();
        System.out.println(animal instanceof Dog); // false

        Bird bird = new Bird();
        System.out.println(bird instanceof Animal); // true
        System.out.println(bird instanceof Bird); // true

        Parrot parrot = new Parrot();
        System.out.println(parrot instanceof Parrot); //true
        System.out.println(parrot instanceof Bird); //true
        System.out.println(parrot instanceof Animal); //true

        System.out.println(animal instanceof Parrot); //false
        //System.out.println(dog instanceof Bird); // bląd kompilacji
    }
}
