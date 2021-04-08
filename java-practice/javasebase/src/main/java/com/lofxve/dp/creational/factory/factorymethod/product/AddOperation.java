package com.lofxve.dp.creational.factory.factorymethod.product;

/**
 * @ClassName AddOperation
 * @Author lofxve
 * @Date 2021/4/8 13:54
 * @Version 1.0
 */
public class AddOperation extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA()+this.getNumberB();
    }
}
