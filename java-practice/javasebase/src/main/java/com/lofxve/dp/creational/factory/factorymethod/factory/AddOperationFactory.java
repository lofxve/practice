package com.lofxve.dp.creational.factory.factorymethod.factory;

import com.lofxve.dp.creational.factory.factorymethod.product.AddOperation;

/**
 * @ClassName AddOperationFactory
 * @Author lofxve
 * @Date 2021/4/8 13:56
 * @Version 1.0
 */
public class AddOperationFactory implements OperationFactory {
    @Override
    public AddOperation getResult() {
        return new AddOperation();
    }
}
