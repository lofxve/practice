package com.lofxve.dp.behavioral.template;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.template
 * @ClassName: AbstractClass
 * @Author: lofxve
 * @Description: 抽象类 出国留学
 * @Date: 2021/4/12 11:16
 * @Version: 1.0
 */
public abstract class AbstractClass {
    //模板方法
    public void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    //具体方法
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    //抽象方法1
    public abstract void abstractMethod1();
    //抽象方法2
    public abstract void abstractMethod2();
}
