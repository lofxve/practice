package com.lofxve.dp.creational.builder.ffr;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder
 * @ClassName: ColdDrink
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/9 9:30
 * @Version: 1.0
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    public abstract float price();
}
