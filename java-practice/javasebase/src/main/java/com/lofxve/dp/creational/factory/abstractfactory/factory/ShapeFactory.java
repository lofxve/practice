package com.lofxve.dp.creational.factory.abstractfactory.factory;

import com.lofxve.dp.creational.factory.abstractfactory.product.Circle;
import com.lofxve.dp.creational.factory.abstractfactory.product.Product;
import com.lofxve.dp.creational.factory.abstractfactory.product.Rectangle;
import com.lofxve.dp.creational.factory.abstractfactory.product.Shape;

/**
 * @ClassName ShapeFactory
 * @Author lofxve
 * @Date 2021/4/8 10:48
 * @Version 1.0
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if ("rectangle".equals(shape)) {
            return new Rectangle();
        } else if ("circle".equals(shape)) {
            return new Circle();
        }
        return null;
    }

    @Override
    public Product getProduct(String shape) {
        return null;
    }
}
