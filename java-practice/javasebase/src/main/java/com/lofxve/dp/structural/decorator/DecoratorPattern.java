package com.lofxve.dp.structural.decorator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.decorator
 * @ClassName: DecoratorPattern
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/9 11:22
 * @Version: 1.0
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        // 创建具体构件
        ConcreteComponent concreteComponent = new ConcreteComponent();

        // 创建装饰器，并将具体构建交给装饰器
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.operation();

        // 创建装饰器，并将具体构建交给装饰器
        ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1(concreteComponent);
        concreteDecorator1.operation();
    }
}
