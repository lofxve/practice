package com.lofxve.dp.creational.factory.factorymethod;

import com.lofxve.dp.creational.factory.factorymethod.factory.AddOperationFactory;
import com.lofxve.dp.creational.factory.factorymethod.factory.MultiplyOperationFactory;
import com.lofxve.dp.creational.factory.factorymethod.product.AddOperation;
import com.lofxve.dp.creational.factory.factorymethod.product.MultiplyOperation;

/**
 * @ClassName FactoryMethodMain
 * @Author lofxve
 * @Date 2021/4/8 14:04
 * @Version 1.0
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        // 创建工厂
        AddOperationFactory addOperationFactory = new AddOperationFactory();
        // 获取工厂的产品
        AddOperation add = addOperationFactory.getResult();
        add.setNumberA(5);
        add.setNumberB(4);
        System.out.println(add.getResult());


        MultiplyOperationFactory multiplyOperationFactory = new MultiplyOperationFactory();
        MultiplyOperation multiply = multiplyOperationFactory.getResult();
        multiply.setNumberA(5);
        multiply.setNumberB(4);
        System.out.println(multiply.getResult());
    }
}
