package com.lofxve.dp.creational.builder.ffr;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder
 * @ClassName: Burger
 * @Author: lofxve
 * @Description: 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * @Date: 2021/4/9 9:29
 * @Version: 1.0
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
