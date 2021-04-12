package com.lofxve.dp.behavioral.mediator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.mediator
 * @ClassName: Colleague
 * @Author: lofxve
 * @Description: 抽象同事类
 * @Date: 2021/4/12 10:27
 * @Version: 1.0
 */
public abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}
