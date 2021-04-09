package com.lofxve.dp.creational.builder.ffr;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder
 * @ClassName: Item
 * @Author: lofxve
 * @Description: 创建一个表示食物条目和食物包装的接口。
 * @Date: 2021/4/9 9:26
 * @Version: 1.0
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
