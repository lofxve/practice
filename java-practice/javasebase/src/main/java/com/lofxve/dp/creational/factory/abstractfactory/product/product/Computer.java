package com.lofxve.dp.creational.factory.abstractfactory.product.product;

import com.lofxve.dp.creational.factory.abstractfactory.product.Product;

/**
 * @ClassName Computer
 * @Author lofxve
 * @Date 2021/4/8 10:53
 * @Version 1.0
 */
public class Computer extends Product {
    public Computer(String factory) {
        super(factory);
    }

    @Override
    public void fun() {
        System.out.println(this.factory + "电脑");
    }
}
