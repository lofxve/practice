package com.lofxve.dp.creational.factory.abstractfactory.factory;

import com.lofxve.dp.creational.factory.abstractfactory.product.Product;
import com.lofxve.dp.creational.factory.abstractfactory.product.Shape;
import com.lofxve.dp.creational.factory.abstractfactory.product.product.Computer;
import com.lofxve.dp.creational.factory.abstractfactory.product.product.Phone;
import com.lofxve.dp.creational.factory.abstractfactory.product.shape.Circle;
import com.lofxve.dp.creational.factory.abstractfactory.product.shape.Rectangle;

/**
 * @ClassName ProductFactory
 * @Author lofxve
 * @Date 2021/4/8 10:49
 * @Version 1.0
 */
public class ProductFactory extends AbstractFactory {
    public ProductFactory(String name) {
        super(name);
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if ("rectangle".equals(shape)) {
            return new Rectangle("tcl");
        } else if ("circle".equals(shape)) {
            return new Circle("tcl");
        }
        return null;
    }

    @Override
    public Product getProduct(String product) {
        if (product == null) {
            return null;
        } else if ("phone".equals(product)) {
            return new Phone("tcl");
        } else if ("computer".equals(product)) {
            return new Computer("tcl");
        }
        return null;
    }
}
