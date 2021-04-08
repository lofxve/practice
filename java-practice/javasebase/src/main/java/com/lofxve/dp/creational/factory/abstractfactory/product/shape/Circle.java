package com.lofxve.dp.creational.factory.abstractfactory.product.shape;

import com.lofxve.dp.creational.factory.abstractfactory.product.Shape;

/**
 * @ClassName Circle
 * @Author lofxve
 * @Date 2021/4/8 11:07
 * @Version 1.0
 */
public class Circle extends Shape {

    public Circle(String factory) {
        super(factory);
    }

    @Override
    public void draw() {
        System.out.println(this.factory + "圆形");
    }
}
