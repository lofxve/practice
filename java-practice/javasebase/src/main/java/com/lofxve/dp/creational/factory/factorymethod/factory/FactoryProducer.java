package com.lofxve.dp.creational.factory.factorymethod.factory;

/**
 * @ClassName FactoryProducer
 * @Author lofxve
 * @Date 2021/4/8 11:16
 * @Version 1.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("product")) {
            return new ProductFactory();
        } else if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
