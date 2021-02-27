package com.lofxve.task.task01.test08;

/**
 * @ClassName Cucumber
 * @Author 魏振东
 * @Date 2020/12/12 18:36
 */
public class Cucumber extends Furit{

    public Cucumber(String color) {
        super(color);
    }

    public Cucumber(double weight, String color) {
        super(weight, color);
    }

    @Override
    public void use() {
        System.out.println("黄瓜炒蛋");
    }

    @Override
    public void eat() {
        System.out.println("做面膜");
    }
}