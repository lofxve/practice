package com.lofxve.dp.creational.factory.abstractfactory.product;

/**
 * @ClassName Product
 * @Author lofxve
 * @Date 2021/4/8 10:17
 * @Version 1.0
 */
public abstract class Product {
    public  String factory;

    public Product(String factory) {
        this.factory = factory;
    }
    public abstract void fun();
}
