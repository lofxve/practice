package com.lofxve.dp.creational.factory.simplefactory;

/**
 * @ClassName SimpleFactoryMain
 * @Author lofxve
 * @Date 2021/4/8 10:31
 * @Version 1.0
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        Product phone = ProductFactory.getProduct("phone");
        phone.fun();
        Product computer = ProductFactory.getProduct("computer");
        computer.fun();
    }
}
