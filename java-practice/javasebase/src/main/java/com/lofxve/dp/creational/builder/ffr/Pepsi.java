package com.lofxve.dp.creational.builder.ffr;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder
 * @ClassName: Pepsi
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/9 9:33
 * @Version: 1.0
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }
    @Override
    public String name() {
        return "Pepsi";
    }
}
