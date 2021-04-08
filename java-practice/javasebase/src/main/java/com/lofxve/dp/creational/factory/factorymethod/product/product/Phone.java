package com.lofxve.dp.creational.factory.factorymethod.product.product;

import com.lofxve.dp.creational.factory.factorymethod.product.Product;

/**
 * @ClassName Phone
 * @Author lofxve
 * @Date 2021/4/8 10:51
 * @Version 1.0
 */
public class Phone implements Product {
    @Override
    public void fun() {
        System.out.println("我是手机");
    }
}
