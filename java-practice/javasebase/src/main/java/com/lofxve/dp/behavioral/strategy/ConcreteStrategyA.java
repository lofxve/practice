package com.lofxve.dp.behavioral.strategy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.strategy
 * @ClassName: ConcreteStrategyA
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/15 16:42
 * @Version: 1.0
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
