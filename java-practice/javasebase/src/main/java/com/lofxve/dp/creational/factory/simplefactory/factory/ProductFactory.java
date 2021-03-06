package com.lofxve.dp.creational.factory.simplefactory.factory;

import com.lofxve.dp.creational.factory.simplefactory.product.Computer;
import com.lofxve.dp.creational.factory.simplefactory.product.Phone;
import com.lofxve.dp.creational.factory.simplefactory.product.Product;

/**
 * @ClassName ProductFactory
 * @Author lofxve
 * @Date 2021/4/8 10:21
 * @Version 1.0
 */
public class ProductFactory {
    public static Product getProduct(String product) {
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
