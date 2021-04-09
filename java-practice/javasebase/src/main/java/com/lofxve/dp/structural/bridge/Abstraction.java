package com.lofxve.dp.structural.bridge;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.bridge
 * @ClassName: Abstraction
 * @Author: lofxve
 * @Description: 抽象化角色  包
 * @Date: 2021/4/9 10:42
 * @Version: 1.0
 */
abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();
}
