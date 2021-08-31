package com.example.oop.basics.inheritance.super_example;

public class SuperTest {
    public static void main(String argsp[]) {
        Student student = new Student("Kasia", "Nowakowska", 5);
        Teacher teacher = new Teacher("Judasz", "Iskariota", "biology");
        System.out.println(teacher.getTeachingSubject());
        Director director = new Director("Anna", "Nadziewanna", 104);

    }
}
