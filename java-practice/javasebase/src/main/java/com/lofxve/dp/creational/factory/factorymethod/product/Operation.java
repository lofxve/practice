package com.lofxve.dp.creational.factory.factorymethod.product;

/**
 * @ClassName Operation
 * @Author lofxve
 * @Date 2021/4/8 13:54
 * @Version 1.0
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    public abstract double getResult();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
