package org.example;

public class Cat implements Animals {
    private String name = "мурка";
    private int age = 10;
    private String color = "Серый";
    private boolean isSwiming = false;
    private boolean isFlying = false;

    /**
     * ID
     * @return id animal
     */
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
    /**
     *
     * @return получаем имя
     */
    public String getName() {
        return name;
    }
    /**
     * задаем имя
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *
     * @return получаем возраст
     */
    public int getAge() {
        return age;
    }
    /**
     * задаем возраст
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     *
     * @return получаем цвет кожи
     */
    public String getColor() {
        return color;
    }
    /**
     * задаем цвет кожи
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     *
     * @return получаем ответ может ли сущность плавать
     */
    public boolean isSwiming() {
        return isSwiming;
    }
    /**
     * задаем способность к плаванию
     */
    public void setSwiming(boolean swiming) {
        isSwiming = swiming;
    }
    /**
     *
     * @return получаем ответ может ли сущность летать
     */
    public boolean isFlying() {
        return isFlying;
    }
    /**
     * задаем способность к полету
     */
    public void setFlying(boolean flying) {
        isFlying = flying;
    }
}