package com.lofxve.dp.creational.builder.product;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder.product
 * @ClassName: ConcreteBuilder
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/9 9:47
 * @Version: 1.0
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }
    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }
    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
