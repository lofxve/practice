package com.lofxve.dp.creational.factory.abstractfactory.product.shape;

import com.lofxve.dp.creational.factory.abstractfactory.product.Shape;

/**
 * @ClassName Circle
 * @Author lofxve
 * @Date 2021/4/8 11:07
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("我画圆形");
    }
}
