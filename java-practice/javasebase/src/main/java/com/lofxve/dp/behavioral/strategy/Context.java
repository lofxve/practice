package com.lofxve.dp.behavioral.strategy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.strategy
 * @ClassName: Context
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/15 16:43
 * @Version: 1.0
 */
public class Context {
    private Strategy strategy;
    public Strategy getStrategy() {
        return strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
