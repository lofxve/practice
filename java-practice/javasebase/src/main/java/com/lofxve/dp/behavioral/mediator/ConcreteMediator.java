package com.lofxve.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.mediator
 * @ClassName: ConcreteMediator
 * @Author: lofxve
 * @Description: 具体中介者
 * @Date: 2021/4/12 10:27
 * @Version: 1.0
 */
public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((Colleague) ob).receive();
            }
        }
    }
}
