package com.example.basics.data;

public class MathRoundCeilFloor {

    public static void main(String args[]) {
        System.out.println(Math.round(5.51));
        System.out.println(Math.round(5.49));
        //rzutowanie utrata cześci ułamkowej
        System.out.println((int) 5.49d);

        //Math.ceil - największa możliwa liczba całkowita
        System.out.println(Math.ceil(6.11));
        System.out.println(Math.ceil(6.8));

        //Math.floor - najmniejsza możliwa liczba całkowita
        System.out.println(Math.floor(6.11));
        System.out.println(Math.floor(6.8));
    }
}
