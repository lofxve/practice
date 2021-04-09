package com.lofxve.dp.structural.decorator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.decorator
 * @ClassName: ConcreteDecorator1
 * @Author: lofxve
 * @Description: 老板
 * @Date: 2021/4/9 13:40
 * @Version: 1.0
 */
class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能 老板");
    }
}
