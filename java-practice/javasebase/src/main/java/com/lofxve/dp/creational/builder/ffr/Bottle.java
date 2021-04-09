package com.lofxve.dp.creational.builder.ffr;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder
 * @ClassName: Bottle
 * @Author: lofxve
 * @Description: 创建实现 Packing 接口的实体类。
 * @Date: 2021/4/9 9:28
 * @Version: 1.0
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
