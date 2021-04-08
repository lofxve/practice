package com.lofxve.dp.creational.factory.abstractfactory;

import com.lofxve.dp.creational.factory.abstractfactory.factory.AbstractFactory;
import com.lofxve.dp.creational.factory.abstractfactory.factory.FactoryProducer;
import com.lofxve.dp.creational.factory.abstractfactory.product.Product;
import com.lofxve.dp.creational.factory.abstractfactory.product.Shape;

/**
 * @ClassName FactoryMethodMain
 * @Author lofxve
 * @Date 2021/4/8 11:17
 * @Version 1.0
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        // 获取构造tcl产品族的工厂
        AbstractFactory product = FactoryProducer.getFactory("tcl");
        // 使用tcl工厂构造产品
        Product phone = product.getProduct("phone");
        phone.fun();
        Product computer = product.getProduct("computer");
        computer.fun();

        // 使用tcl工厂构造产品
        Shape rectangle = product.getShape("rectangle");
        rectangle.draw();
        Shape circle = product.getShape("circle");
        circle.draw();


        // 获取构造haier产品族的工厂
        AbstractFactory shape = FactoryProducer.getFactory("haier");
        // 使用haier工厂构造产品
        Shape rectangle1 = shape.getShape("rectangle");
        rectangle1.draw();
        Shape circle1 = shape.getShape("circle");
        circle1.draw();
        // 使用haier工厂构造产品
        Product phone1 = shape.getProduct("phone");
        phone1.fun();
        Product computer1 = shape.getProduct("computer");
        computer1.fun();
    }
}
