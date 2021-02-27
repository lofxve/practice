package com.lofxve.classtest.interfacedome.pe;

/**
 * @ClassName jiaolian
 * @Author 魏振东
 * @Date 2020/12/13 12:00
 */
public class jiaolian extends Person{
    public jiaolian() {
    }

    public jiaolian(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("教练员要吃工作餐");
    }
}