package com.lofxve.DesignPattern.FactoryPattern.dome2.product.impl;

import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IRouterProduct;

/**
 * 小米路由器产品
 */
public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开小米路由器的wifi功能");
    }

    @Override
    public void setting() {
        System.out.println("设置小米路由器参数");
    }
}