package com.example.basics.data.string_class;

public class Functions_replaceAll_replaceFirst {

    public static void main(String args[]) {
        String str = ("Jan Kowalski Ola Kowalska");
        String str1 = str.replaceAll("Kowalska", "Zawadzka");
        System.out.println(str1);
        String str2 = str1.replaceFirst("Jan","Michał");
        System.out.println(str2);
    }

}
