package com.lofxve.DesignPattern.FactoryPattern.dome2.product.impl;

import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IPhoneProduct;

/**
 * 华为手机产品
 */
public class HuaweiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callUp() {
        System.out.println("用华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("用华为手机发短信");
    }
}