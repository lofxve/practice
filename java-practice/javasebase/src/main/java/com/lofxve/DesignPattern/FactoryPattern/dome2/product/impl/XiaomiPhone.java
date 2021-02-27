package com.lofxve.DesignPattern.FactoryPattern.dome2.product.impl;

import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IPhoneProduct;

/**
 * 小米手机产品
 */
public class XiaomiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callUp() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("用小米手机发短信");
    }
}