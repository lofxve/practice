package com.lofxve.dp.creational.factory.factorymethod;

import com.lofxve.dp.creational.factory.factorymethod.factory.AbstractFactory;
import com.lofxve.dp.creational.factory.factorymethod.factory.FactoryProducer;
import com.lofxve.dp.creational.factory.factorymethod.product.Product;
import com.lofxve.dp.creational.factory.factorymethod.product.Shape;

/**
 * @ClassName FactoryMethodMain
 * @Author lofxve
 * @Date 2021/4/8 11:17
 * @Version 1.0
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        // 获取构造什么的工厂
        AbstractFactory product = FactoryProducer.getFactory("product");
        // 使用工厂构造产品
        Product phone = product.getProduct("phone");
        phone.fun();
        Product computer = product.getProduct("computer");
        computer.fun();

        // 获取构造什么的工厂
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        // 使用工厂构造产品
        Shape rectangle = shape.getShape("rectangle");
        rectangle.draw();
        Shape circle = shape.getShape("circle");
        circle.draw();
    }
}
