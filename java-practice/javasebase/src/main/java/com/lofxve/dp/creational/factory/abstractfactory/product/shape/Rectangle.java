package com.lofxve.dp.creational.factory.abstractfactory.product.shape;

import com.lofxve.dp.creational.factory.abstractfactory.product.Shape;

/**
 * @ClassName Rectangle
 * @Author lofxve
 * @Date 2021/4/8 10:55
 * @Version 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("我画正方形");
    }
}