package com.lofxve.dp.structural.decorator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.decorator
 * @ClassName: ConcreteDecorator
 * @Author: lofxve
 * @Description: 具体的装饰角色 员工
 * @Date: 2021/4/9 11:20
 * @Version: 1.0
 */
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能 员工");
    }
}
