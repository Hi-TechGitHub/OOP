package org.example;

public class Cat implements Animals {
    String name = "мурка";
    int age = 10;
    String color = "Серый";
    boolean isSwiming = false;
    boolean isFlying = false;

    @Override
    public int id() {
        return 1;
    }

    @Override
    public String type() {
        return "Кот";
    }

    @Override
    public String toString() {
        return String.format("name = %s%n" +
                "age = %d%n" +
                "isSwiming = %b%n" +
                "isFlying = %b%n" +
                "Color = %s%n" +
                "type = %s%n" +
                "Id = %d%n", name, age, isSwiming, isFlying, color, type(), id());
    }
}