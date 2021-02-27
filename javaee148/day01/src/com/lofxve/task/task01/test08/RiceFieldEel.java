package com.lofxve.task.task01.test08;

/**
 * @ClassName RiceFieldEel
 * @Author 魏振东
 * @Date 2020/12/12 18:40
 */
public class RiceFieldEel extends Fish {

    public RiceFieldEel() {
    }

    public RiceFieldEel(String type, String price) {
        super(type, price);
    }

    public RiceFieldEel(double weight, String type, String price) {
        super(weight, type, price);
    }

    @Override
    public void eat() {
        System.out.println("鳝鱼粥");
    }
}