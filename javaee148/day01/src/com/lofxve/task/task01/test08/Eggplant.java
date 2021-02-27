package com.lofxve.task.task01.test08;

/**
 * @ClassName Eggplant
 * @Author 魏振东
 * @Date 2020/12/12 18:37
 */
public class Eggplant extends Furit{

    public Eggplant(String color) {
        super(color);
    }

    public Eggplant(double weight, String color) {
        super(weight, color);
    }

    @Override
    public void use() {
        System.out.println("油焖茄子");
    }

    @Override
    public void eat() {
        System.out.println("做中药");
    }
}