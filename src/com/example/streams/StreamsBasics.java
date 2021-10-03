package com.example.streams;

import java.util.ArrayList;

public class StreamsBasics {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Asia");
        arr.add("Paweł");
        arr.add("Daniel");
        arr.add("Ola");
        arr.add("Zuzanna");
        arr.add("Zenon");

        arr.stream().filter(str -> str.length() > 3 && str.length() < 7)
                .filter(str -> str.startsWith("A") || str.startsWith("P"))
                .forEach(str -> System.out.println(str));
    }
}
