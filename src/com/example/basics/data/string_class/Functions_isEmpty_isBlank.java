package com.example.basics.data.string_class;

public class Functions_isEmpty_isBlank {
    public static void main(String args[]) {

        String emptyStr = "";
        String blankStr = "   \n            ";

        if (emptyStr.isEmpty()) {
            System.out.println("emptyStr jest pusty 0 isEmpty()");
        }

        if (blankStr.isEmpty()) {
            System.out.println("blankStr nie jest pusty - isEmpty()");
        } else {
            System.out.println("blankStr jest pusty - isEmpty()");
        }

        if (emptyStr.isBlank()) {
            System.out.println("emptyStr ma 0 znaków lub same białe znaki - isBlank()");
        }
        if (blankStr.isBlank()) {
            System.out.println("blankStr 0 znaków lub same białe znaki - isBlank()");
        }

    }
}