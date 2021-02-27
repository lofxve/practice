package com.lofxve.DesignPattern.FactoryPattern.dome2.Factory.impl;

import com.lofxve.DesignPattern.FactoryPattern.dome2.Factory.IProductFactory;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IPhoneProduct;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IRouterProduct;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.impl.HuaweiPhone;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.impl.HuaweiRouter;

/**
 * 华为产品工厂
 */
public class HuaweiProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产华为手机");
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产华为路由器");
        return new HuaweiRouter();
    }
}