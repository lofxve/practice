package com.lofxve.dp.creational.factory.abstractfactory.product.product;

import com.lofxve.dp.creational.factory.abstractfactory.product.Product;

/**
 * @ClassName Phone
 * @Author lofxve
 * @Date 2021/4/8 10:51
 * @Version 1.0
 */
public class Phone extends Product {
    public Phone(String factory) {
        super(factory);
    }

    @Override
    public void fun() {
        System.out.println(this.factory + "手机");
    }
}
