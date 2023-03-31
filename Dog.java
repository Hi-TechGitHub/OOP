package org.example;

public class Dog implements Animals {
    String name = "Бобик";
    int age = 5;
    String color = "Коричневый";
    boolean isSwiming = true;
    boolean isFlying = false;

    @Override
    public int id() {
        return 2;
    }

    @Override
    public String type() {
        return "Собака";
    }

    @Override
    public String toString() {
        return String.format("name = %s%n" +
                "age = %d%n" +
                "isSwiming = %b%n" +
                "isFlying = %b%n" +
                "Color = %s%n" +
                "Type = %s%n" +
                "Id = %d%n", name, age, isSwiming, isFlying, color, type(), id());
    }
}
