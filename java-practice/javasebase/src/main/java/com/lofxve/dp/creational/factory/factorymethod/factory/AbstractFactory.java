package com.lofxve.dp.creational.factory.factorymethod.factory;

import com.lofxve.dp.creational.factory.factorymethod.product.Product;
import com.lofxve.dp.creational.factory.factorymethod.product.Shape;

/**
 * @ClassName AbstractFactory
 * @Author lofxve
 * @Date 2021/4/8 10:47
 * @Version 1.0
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);

    public  abstract Product getProduct(String shape);
}
