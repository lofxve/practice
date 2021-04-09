package com.lofxve.dp.structural.decorator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.decorator
 * @ClassName: ConcreteComponent
 * @Author: lofxve
 * @Description: 具体构建角色 上司
 * @Date: 2021/4/9 11:19
 * @Version: 1.0
 */
class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色：上司");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
