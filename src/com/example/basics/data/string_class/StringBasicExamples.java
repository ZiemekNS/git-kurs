package com.example.basics.data.string_class;

public class StringBasicExamples {
    public static void main(String args[]) {
        String s1 = "Hello WOrld";
        String s2 = new String("String passed to constructor");

        String s3 = "Test".repeat(5);
        System.out.println(s3);

        String s4 = String.join(".", "1", "2", "3", "4", "5");
        System.out.println(s4);

        char Arr[] = {'O', 'L', 'A'};
        String s5 = new String(Arr);

        System.out.println(s5);

    }
}
