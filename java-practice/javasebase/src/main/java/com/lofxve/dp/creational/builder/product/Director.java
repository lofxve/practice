package com.lofxve.dp.creational.builder.product;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder.product
 * @ClassName: Director
 * @Author: lofxve
 * @Description: 指挥者：调用建造者中的方法完成复杂对象的创建。
 * @Date: 2021/4/9 9:45
 * @Version: 1.0
 */
class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
