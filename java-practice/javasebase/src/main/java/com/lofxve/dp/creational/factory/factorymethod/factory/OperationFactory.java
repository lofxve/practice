package com.lofxve.dp.creational.factory.factorymethod.factory;

import com.lofxve.dp.creational.factory.factorymethod.product.Operation;

/**
 * @ClassName OperationFactory
 * @Author lofxve
 * @Date 2021/4/8 13:55
 * @Version 1.0
 */
public interface OperationFactory {
    public Operation getResult();
}
