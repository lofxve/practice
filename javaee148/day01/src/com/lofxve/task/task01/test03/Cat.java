package com.lofxve.task.task01.test03;

/**
 * @ClassName Cat
 * @Author 魏振东
 * @Date 2020/12/12 16:19
 */
public class Cat extends Animal{

    public Cat(String name, int age, String sex, String color) {
        super(name, age, sex, color);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void call() {
        System.out.println("喵喵");
    }
}