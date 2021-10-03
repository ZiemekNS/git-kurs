package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String[] args) {


        ArrayList<String> arr = new ArrayList<>();

        arr.stream().filter(str -> str.length() > 3 && str.length() < 7)
                .filter(str -> str.startsWith("A") || str.startsWith("P"))
                .forEach(str -> System.out.println(str));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Opel", 220, 150000, 4));
        cars.add(new Car("Merc", 250, 400000, 5));
        cars.add(new Car("GMC", 170, 100000, 3));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("BMW", 240, 300000, 5));

        List<Car> list = cars.stream().filter(car -> car.price < 300000)
                .collect(Collectors.toList());

        ArrayList<Car> carArrayList = new ArrayList<>(list);
        carArrayList.forEach(car -> System.out.println(car));
    }
}
