package com.lofxve.dp.creational.factory.abstractfactory.factory;

import com.lofxve.dp.creational.factory.abstractfactory.product.Product;
import com.lofxve.dp.creational.factory.abstractfactory.product.Shape;
import com.lofxve.dp.creational.factory.abstractfactory.product.product.Computer;
import com.lofxve.dp.creational.factory.abstractfactory.product.product.Phone;

/**
 * @ClassName ProductFactory
 * @Author lofxve
 * @Date 2021/4/8 10:49
 * @Version 1.0
 */
public class ProductFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Product getProduct(String product) {
        if (product == null) {
            return null;
        } else if ("phone".equals(product)) {
            return new Phone();
        } else if ("computer".equals(product)) {
            return new Computer();
        }
        return null;
    }
}
