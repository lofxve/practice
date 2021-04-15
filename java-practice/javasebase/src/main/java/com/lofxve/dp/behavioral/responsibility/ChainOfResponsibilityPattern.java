package com.lofxve.dp.behavioral.responsibility;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.responsibility
 * @ClassName: ChainOfResponsibilityPattern
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/15 9:43
 * @Version: 1.0
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("two");
    }
}
