package com.lofxve.dp.behavioral.strategy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.strategy
 * @ClassName: StrategyPattern
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/15 16:43
 * @Version: 1.0
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
