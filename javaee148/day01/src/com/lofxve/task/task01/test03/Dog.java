package com.lofxve.task.task01.test03;

/**
 * @ClassName Dog
 * @Author 魏振东
 * @Date 2020/12/12 16:20
 */
public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public Dog(String name, int age, String sex, String color) {
        super(name, age, sex, color);
    }

    public Dog() {
    }

    @Override
    public void call() {
        System.out.println("旺旺");
    }
}