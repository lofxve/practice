package com.lofxve.dp.behavioral.strategy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.strategy
 * @ClassName: ConcreteStrategyB
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/15 16:43
 * @Version: 1.0
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略b的策略方法被访问！");
    }
}
