package org.example;

public class Cat extends Animals {
    public Cat() {
        isSwiming = false;
        isFlying = false;
    }
    @Override
    public void sound() {
        System.out.println("Мяу-мяуууу");
    }

    @Override
    public String toString() {
        return String.format("name = %s%n" +
                "age = %d%n" +
                "isSwiming = %b%n" +
                "isFlying = %b%n", name, age, isSwiming, isFlying);
    }
}
