package com.lofxve.dp.creational.builder.product;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder.product
 * @ClassName: ConcreteBuilder1
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/9 9:54
 * @Version: 1.0
 */
public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA1");
    }
    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB1");
    }
    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC1");
    }
}
