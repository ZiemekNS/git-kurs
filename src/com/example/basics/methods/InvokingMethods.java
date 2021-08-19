package com.example.basics.methods;

class Triangle {
    float a; //dlugosc podstawy trojkata
    float h; // wysokosc trojkata
    float surfaceArea; //pole powierzchni
    Triangle(float base, float high){
        a = base;
        h = high;
    }
}

class MyMath {

    public void add(int a, int b){
        a = 20;
        int result = a + b;
        System.out.println("Result: " + result);

    }
}

public class InvokingMethods {

    public static void main(String[] args) {

    MyMath math = new MyMath();
    int a = 10;
    int b = 7;
    math.add(a,b);

    Triangle triangle = new Triangle(10, 5);

    }
}
