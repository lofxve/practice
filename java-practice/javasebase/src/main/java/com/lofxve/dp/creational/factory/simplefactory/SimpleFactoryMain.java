package com.lofxve.dp.creational.factory.simplefactory;

import com.lofxve.dp.creational.factory.simplefactory.factory.ProductFactory;
import com.lofxve.dp.creational.factory.simplefactory.product.Product;

/**
 * @ClassName SimpleFactoryMain
 * @Author lofxve
 * @Date 2021/4/8 10:31
 * @Version 1.0
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        // 使用工厂构造产品
        Product phone = ProductFactory.getProduct("phone");
        phone.fun();
        Product computer = ProductFactory.getProduct("computer");
        computer.fun();
    }
}
