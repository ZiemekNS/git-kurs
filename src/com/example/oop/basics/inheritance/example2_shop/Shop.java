package com.example.oop.basics.inheritance.example2_shop;

/*
    klasa Shop
    klasa Product(zmienne: price, name, manufacturer, productionYear)
        klasa Mouse extends Product (zmienne: numButtons = 3)
            klasa verticalMouse extends Mouse (zmienne: - )
        klasa Monitor extends Product (zmienne: resolution = 1080)
        klasa Keyboard extends Product (zmienne: numKeys = 104)
        klasa Computer extends Product (zmienne: mouse, monitor, keyboard)

    Dodajemy pusty konstruktor do każdej klasy, ustawiamy dla nich pola danej klasy
    Tworzymy egzemplarze klas w metodzie main
    Każda klasa w oddzielnym pliku Java
 */

public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        product.productionYear = 1000;

        Mouse mouse = new Mouse();
        mouse.numButtons = 4;

        VerticalMouse verticalMouse = new VerticalMouse();
        verticalMouse.numButtons = 10;

        Monitor monitor = new Monitor();

        Keyboard keyboard = new Keyboard();
        keyboard.numKey = 106;

        Computer computer = new Computer();
        System.out.println(computer.monitor.resolution);
        System.out.println("Keyboard price: " + keyboard.price);
        System.out.println("Computer price: " + computer.price);
        System.out.println("Monitor price: " + monitor.price);

    }
}
