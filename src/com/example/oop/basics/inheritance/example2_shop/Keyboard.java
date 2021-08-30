package com.example.oop.basics.inheritance.example2_shop;

public class Keyboard extends Product {
    public int numKey;

    Keyboard() {
        numKey = 104;
        price = 50.0f;
    }

    Keyboard(int numKey) {
        this.numKey = numKey;
    }

}

