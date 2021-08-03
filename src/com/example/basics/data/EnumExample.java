package com.example.basics.data;

public class EnumExample {

    enum SoundVolume { LOW, MEDIUM, HIGH, VERY_HIGH};
    enum CarVariant {SEDAN, COMBI, SUPERC_AR};

    public static void main(String args[]) {

        SoundVolume phoneSound = SoundVolume.LOW;
        System.out.println(phoneSound);
    }
}
