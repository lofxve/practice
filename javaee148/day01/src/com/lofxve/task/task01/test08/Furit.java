package com.lofxve.task.task01.test08;

/**
 * @ClassName Furit
 * @Author 魏振东
 * @Date 2020/12/12 17:58
 */
public abstract class Furit extends Food {
    private String color;

    public Furit() {
    }

    public Furit(String color) {
        this.color = color;
    }

    public Furit(double weight, String color) {
        super(weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furit{" +
                "color='" + color + '\'' +
                '}';
    }

    public abstract void use();
}