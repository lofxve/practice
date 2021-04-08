package com.lofxve.dp.creational.factory.abstractfactory.product;

/**
 * @ClassName Shape
 * @Author lofxve
 * @Date 2021/4/8 10:46
 * @Version 1.0
 */
public abstract class Shape {
    public String factory;

    public Shape(String factory) {
        this.factory = factory;
    }

    public abstract void draw();
}
