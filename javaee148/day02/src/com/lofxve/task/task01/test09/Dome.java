package com.lofxve.task.task01.test09;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 19:52
 */
public class Dome {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        System.out.println("==========添加商品==============");
        gouWuChe.addGoods(new Laptop("g10000", "笔记本", 10000));
        gouWuChe.addGoods(new Phone("g10001", "手机", 5000));
        gouWuChe.addGoods(new Phone("g20000", "苹果", 50));
        System.out.println("==========打印商品==============");
        gouWuChe.showGoods();
        System.out.println("------------");
        gouWuChe.total();

    }

}