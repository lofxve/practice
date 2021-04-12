package com.lofxve.dp.behavioral.mediator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.mediator
 * @ClassName: ConcreteColleague2
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/12 10:28
 * @Version: 1.0
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }
}
