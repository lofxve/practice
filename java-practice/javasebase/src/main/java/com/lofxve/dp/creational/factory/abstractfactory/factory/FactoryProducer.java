package com.lofxve.dp.creational.factory.abstractfactory.factory;

/**
 * @ClassName FactoryProducer
 * @Author lofxve
 * @Date 2021/4/8 11:16
 * @Version 1.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("tcl")) {
            // tcl
            return new ProductFactory("tcl");
        } else if (choice.equalsIgnoreCase("haier")) {
            // haier
            return new ShapeFactory("haier");
        }
        return null;
    }
}
