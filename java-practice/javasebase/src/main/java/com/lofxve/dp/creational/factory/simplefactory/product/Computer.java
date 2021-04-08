package com.lofxve.dp.creational.factory.simplefactory.product;

import com.lofxve.dp.creational.factory.simplefactory.product.Product;

/**
 * @ClassName Computer
 * @Author lofxve
 * @Date 2021/4/8 10:20
 * @Version 1.0
 */
public class Computer implements Product {
    @Override
    public void fun() {
        System.out.println("我是电脑");
    }
}
