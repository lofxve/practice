package com.lofxve.dp.behavioral.mediator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.mediator
 * @ClassName: Mediator
 * @Author: lofxve
 * @Description: 抽象中介者
 * @Date: 2021/4/12 10:26
 * @Version: 1.0
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}
