package com.lofxve.DesignPattern.FactoryPattern.dome2.Factory.impl;

import com.lofxve.DesignPattern.FactoryPattern.dome2.Factory.IProductFactory;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IPhoneProduct;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IRouterProduct;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.impl.XiaomiPhone;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.impl.XiaomiRouter;

/**
 * 小米产品工厂
 */
public class XiaomiProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产小米手机");
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产小米路由器");
        return new XiaomiRouter();
    }
}