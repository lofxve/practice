package com.lofxve.dp.structural.bridge.dome;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.bridge.dome
 * @ClassName: BridgeDome
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/14 13:44
 * @Version: 1.0
 */
interface impl {
    public void OperationImpl();
}

abstract class AbstractionDome {
    protected impl i = null;

    protected AbstractionDome(impl i) {
        this.i = i;
    }

    abstract void Operation();
}

class RedColor implements impl {

    @Override
    public void OperationImpl() {
        System.out.println("红色的");
    }
}

class BlueColor implements impl {

    @Override
    public void OperationImpl() {
        System.out.println("红色的");
    }
}

class pack1 extends AbstractionDome {
    protected pack1(impl i) {
        super(i);
    }

    @Override
    void Operation() {
        System.out.println("生产单肩包");
        i.OperationImpl();
    }
}

class pack2 extends AbstractionDome {
    protected pack2(impl i) {
        super(i);
    }

    @Override
    void Operation() {
        System.out.println("生产双肩包");
        i.OperationImpl();
    }
}

public class BridgeDome {
    public static void main(String[] args) {
        RedColor redColor = new RedColor();
        pack1 pack1 = new pack1(redColor);
        pack1.Operation();

        RedColor redColor2 = new RedColor();
        pack2 pack2 = new pack2(redColor2);
        pack2.Operation();
    }
}
