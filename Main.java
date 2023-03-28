package org.example;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.sound();
        Cat cat = new Cat();
        cat.name = "Бусик";
        cat.age = 5;
        System.out.println(cat);
        }
    }