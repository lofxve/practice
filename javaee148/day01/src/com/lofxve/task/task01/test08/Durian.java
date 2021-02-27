package com.lofxve.task.task01.test08;

/**
 * @ClassName Durian
 * @Author 魏振东
 * @Date 2020/12/12 18:39
 */
public class Durian extends Furit {

    public Durian(String color) {
        super(color);
    }

    public Durian(double weight, String color) {
        super(weight, color);
    }

    @Override
    public void use() {
        System.out.println("榴莲酥");
    }

    @Override
    public void eat() {
        System.out.println("砸人");
    }
}