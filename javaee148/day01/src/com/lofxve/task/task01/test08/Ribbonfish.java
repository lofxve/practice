package com.lofxve.task.task01.test08;

/**
 * @ClassName Ribbonfish
 * @Author 魏振东
 * @Date 2020/12/12 18:42
 */
public class Ribbonfish extends Fish{

    public Ribbonfish() {
    }

    public Ribbonfish(String type, String price) {
        super(type, price);
    }

    public Ribbonfish(double weight, String type, String price) {
        super(weight, type, price);
    }

    @Override
    public void eat() {
        System.out.println("糖醋带鱼");
    }
}