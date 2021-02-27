package com.lofxve.task.task02.test02;

/**
 * @ClassName BaoM
 * @Author 魏振东
 * @Date 2020/12/13 20:22
 */
public class BaoM extends M implements Gps{

    public BaoM() {
    }

    public BaoM(String type, String price) {
        super(type, price);
    }

    @Override
    public void gps() {
        System.out.println("宝马摩托");
    }
}