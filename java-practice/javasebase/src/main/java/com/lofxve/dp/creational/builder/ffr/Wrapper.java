package com.lofxve.dp.creational.builder.ffr;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder
 * @ClassName: Wrapper
 * @Author: lofxve
 * @Description: 创建实现 Packing 接口的实体类。
 * @Date: 2021/4/9 9:27
 * @Version: 1.0
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
