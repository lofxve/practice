package com.lofxve.dp.creational.builder.product;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder.product
 * @ClassName: Builder
 * @Author: lofxve
 * @Description: 抽象建造者：包含创建产品各个子部件的抽象方法。
 * @Date: 2021/4/9 9:44
 * @Version: 1.0
 */
abstract class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }
}
