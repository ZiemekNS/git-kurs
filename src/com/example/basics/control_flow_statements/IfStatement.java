package com.example.basics.control_flow_statements;

public class IfStatement {

    public static void main(String args[]) {

        int a = 3;
        if (a > 5) {
            System.out.println("a jest wieksze od 5");
        } else if (a == 2) {
            System.out.println("a jest rowne 2");
        } else if (a == 3) {
            System.out.println(("a jest rowne 3"));
        } else {
            System.out.println("wartość a jest równa: " + a);
        }
    }
}
