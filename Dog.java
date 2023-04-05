package org.example;

public class Dog implements Animals {
    private String name = "Бобик";
    private int age = 5;
    private String color = "Коричневый";
    private boolean isSwiming = true;
    private boolean isFlying = false;

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
