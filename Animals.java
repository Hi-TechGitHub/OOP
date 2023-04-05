package org.example;

public interface Animals {
    /**
     *
     * @return Возвращает ID
     */
    int id();
    /**
     *
     * @return возвращает тип животного
     */
    default String type() {
        String typeOfAnimal = null;
        return typeOfAnimal;
    }
}
