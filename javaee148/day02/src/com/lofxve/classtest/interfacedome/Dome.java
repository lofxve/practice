package com.lofxve.classtest.interfacedome;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/11 10:56
 */
public class Dome {
    public static void main(String[] args) {
        /**
         *  收银员
         **/
        // 无参数构造
        Cashier cashier = new Cashier();
        cashier.setName("张三");
        cashier.setId("001");
        cashier.toString();
        cashier.eat();
        cashier.work();
        cashier.count();
        cashier.ai();

        //有参构造方法
        cashier = new Cashier("李四", "002");
        Cashier cashier02 = cashier;
        cashier02.toString();
        cashier02.eat();
        cashier02.work();
        cashier02.count();
        cashier02.ai();

    }

}