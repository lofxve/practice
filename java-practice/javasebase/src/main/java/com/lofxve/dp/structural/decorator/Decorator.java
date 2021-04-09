package com.lofxve.dp.structural.decorator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.decorator
 * @ClassName: Decorator
 * @Author: lofxve
 * @Description: 抽象装饰角色 装饰器
 * @Date: 2021/4/9 11:20
 * @Version: 1.0
 */
class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
