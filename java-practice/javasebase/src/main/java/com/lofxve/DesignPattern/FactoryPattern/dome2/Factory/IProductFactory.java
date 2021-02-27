package com.lofxve.DesignPattern.FactoryPattern.dome2.Factory;

import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IPhoneProduct;
import com.lofxve.DesignPattern.FactoryPattern.dome2.product.IRouterProduct;

/**
 * 抽象产品工厂（定义了同一个产品族的产品生产行为）
 */
public interface IProductFactory {

    /**
     * 生产手机
     * @return
     */
    IPhoneProduct produceTelPhone();

    /**
     * 生产路由器
     * @return
     */
    IRouterProduct produceRouter();

}