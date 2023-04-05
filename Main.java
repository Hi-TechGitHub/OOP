package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(5);
        System.out.println(cat);
        Dog dog = new Dog();
        dog.setAge(5);

        System.out.println(dog.getAge());
    }
}