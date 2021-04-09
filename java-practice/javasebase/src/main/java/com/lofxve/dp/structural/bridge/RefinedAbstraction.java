package com.lofxve.dp.structural.bridge;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.bridge
 * @ClassName: RefinedAbstraction
 * @Author: lofxve
 * @Description: 扩展抽象化角色 旅行包
 * @Date: 2021/4/9 10:42
 * @Version: 1.0
 */
class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        System.out.println("生产旅行包");
        imple.OperationImpl();
    }
}
