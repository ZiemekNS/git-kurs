package com.example.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListiterationManipulation {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Ola");
        String p1 = "Adam";
        list.add(p1);
        list.addFirst("Rafał");
        list.addLast("Olek");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("Ola")) {
                iterator.set("Zuza");
            }
            if (str.equalsIgnoreCase("Adam")) {
                iterator.add("Karol");
            }
            if (str.equalsIgnoreCase("Rafał")){
                iterator.remove();
            }
            Iterator<String> iter = list.iterator();
            while(iter.hasNext()){
                System.out.println(iter.next());
            }


        }
    }
}
