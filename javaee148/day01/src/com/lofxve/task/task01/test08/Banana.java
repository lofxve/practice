package com.lofxve.task.task01.test08;

/**
 * @ClassName Banana
 * @Author 魏振东
 * @Date 2020/12/12 18:38
 */
public class Banana extends Furit{

    public Banana(String color) {
        super(color);
    }

    public Banana(double weight, String color) {
        super(weight, color);
    }

    public Banana() {

    }

    @Override
    public void use() {
        System.out.println("脆皮香蕉");
    }

    @Override
    public void eat() {
        System.out.println("做香蕉面膜");
    }
}