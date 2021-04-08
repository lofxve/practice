package com.lofxve.dp.creational.factory.factorymethod.product;

/**
 * @ClassName MultiplyOperation
 * @Author lofxve
 * @Date 2021/4/8 14:00
 * @Version 1.0
 */
public class MultiplyOperation extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA() * this.getNumberB();
    }
}
