package com.lofxve.task.task02.test02;

/**
 * @ClassName BaoCar
 * @Author 魏振东
 * @Date 2020/12/13 20:21
 */
public class BaoCar extends Cars implements Gps{
    public BaoCar() {
    }

    public BaoCar(String type, String price) {
        super(type, price);
    }

    @Override
    public void gps() {
        System.out.println("宝马汽车");
    }
}