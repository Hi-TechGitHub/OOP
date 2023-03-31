package org.example;

public interface Animals {
    int id();

    default String type() {
        String typeOfAnimal = null;
        return typeOfAnimal;
    }
}
