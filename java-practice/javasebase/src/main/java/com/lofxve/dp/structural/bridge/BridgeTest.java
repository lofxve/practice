package com.lofxve.dp.structural.bridge;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.bridge
 * @ClassName: BridgeTest
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/9 10:44
 * @Version: 1.0
 */
public class BridgeTest {
    public static void main(String[] args) {
        // 需要什么颜色的
        Implementor imple = new ConcreteImplementorA();
        // 创建什么包
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}
