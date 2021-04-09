package com.lofxve.dp.creational.builder.product;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder.product
 * @ClassName: Client
 * @Author: lofxve
 * @Description: 客户类。
 * @Date: 2021/4/9 9:46
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 使用A方案建造
        Builder builder = new ConcreteBuilder();
        // 指挥者获取方案
        Director director = new Director(builder);
        // 建造
        Product product = director.construct();
        // 客户验收
        product.show();

        // 使用A方案建造
        Builder builder1 = new ConcreteBuilder1();
        // 指挥者获取方案
        Director director1 = new Director(builder1);
        // 建造
        Product product1 = director1.construct();
        // 客户验收
        product1.show();
    }
}
