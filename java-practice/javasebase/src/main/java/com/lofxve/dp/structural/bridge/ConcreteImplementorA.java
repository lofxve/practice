package com.lofxve.dp.structural.bridge;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.bridge
 * @ClassName: ConcreteImplementorA
 * @Author: lofxve
 * @Description: 具体实现化角色 红色
 * @Date: 2021/4/9 10:41
 * @Version: 1.0
 */
class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
        System.out.println("涂上红色");
    }
}
