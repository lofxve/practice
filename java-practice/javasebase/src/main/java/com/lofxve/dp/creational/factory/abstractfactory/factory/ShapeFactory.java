package com.lofxve.dp.creational.factory.abstractfactory.factory;

import com.lofxve.dp.creational.factory.abstractfactory.product.product.Computer;
import com.lofxve.dp.creational.factory.abstractfactory.product.product.Phone;
import com.lofxve.dp.creational.factory.abstractfactory.product.shape.Circle;
import com.lofxve.dp.creational.factory.abstractfactory.product.Product;
import com.lofxve.dp.creational.factory.abstractfactory.product.shape.Rectangle;
import com.lofxve.dp.creational.factory.abstractfactory.product.Shape;

/**
 * @ClassName ShapeFactory
 * @Author lofxve
 * @Date 2021/4/8 10:48
 * @Version 1.0
 */
public class ShapeFactory extends AbstractFactory {
    public ShapeFactory(String name) {
        super(name);
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if ("rectangle".equals(shape)) {
            return new Rectangle("haier");
        } else if ("circle".equals(shape)) {
            return new Circle("haier");
        }
        return null;
    }

    @Override
    public Product getProduct(String shape) {
        if (shape == null) {
            return null;
        } else if ("phone".equals(shape)) {
            return new Phone("haier");
        } else if ("computer".equals(shape)) {
            return new Computer("haier");
        }
        return null;
    }
}
