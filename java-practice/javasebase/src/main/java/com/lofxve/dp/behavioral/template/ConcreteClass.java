package com.lofxve.dp.behavioral.template;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.template
 * @ClassName: ConcreteClass
 * @Author: lofxve
 * @Description: 具体子类 去美国留学
 * @Date: 2021/4/12 11:17
 * @Version: 1.0
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
