package com.lofxve.dp.behavioral.mediator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.mediator
 * @ClassName: MediatorPattern
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/12 10:30
 * @Version: 1.0
 */
public class MediatorPattern {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2, c3;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        c3 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        md.register(c3);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
