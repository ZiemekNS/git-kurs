package com.example.basics.methods;

class RectangleOverloading{
    float side1, side2;

    
}

class MathOverloading{
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b){
        return a + b;
    }

    public float  add(float a, float b){
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {

        MathOverloading math = new MathOverloading();
        int a = 14;
        int b = 3;
        System.out.println(math.add(a,b));
        System.out.println(math.add(a,b,b));

        float f1 = 10.0f;
        float f2 = 12.0f;
        System.out.println(math.add(f1, f2));
    }
}