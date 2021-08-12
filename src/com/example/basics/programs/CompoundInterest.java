package com.example.basics.programs;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital; // rezultat oszczędzania

        System.out.println("Jaki jest Twój kapitał początkowy?");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Przez ile lat zamierzasz oszczędzać?");
        numYears = in.nextInt();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest/100), numYears);
        System.out.println("Finalnie uda się zaoszczędzić " + Math.round(finalCapital));


    }
}
