package com.lofxve.dp.creational.factory.factorymethod.factory;

import com.lofxve.dp.creational.factory.factorymethod.product.MultiplyOperation;

/**
 * @ClassName MultiplyOperationFactory
 * @Author lofxve
 * @Date 2021/4/8 14:02
 * @Version 1.0
 */
public class MultiplyOperationFactory implements OperationFactory {

    @Override
    public MultiplyOperation getResult() {
        return new MultiplyOperation();
    }
}
