package com.lofxve.dp.behavioral.mediator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.mediator
 * @ClassName: ConcreteColleague1
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/12 10:28
 * @Version: 1.0
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }
    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
