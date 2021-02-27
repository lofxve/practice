package com.lofxve.classtest.abstractdome.work;

import com.lofxve.classtest.extendsdome.Sales;

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

        //有参构造方法
        Cashier cashier02 = new Cashier("李四","002");
        cashier02.toString();
        cashier02.eat();
        cashier02.work();

        /**
         *  收货人员
         **/
        // 无参数构造
        Sales sales = new Sales();
        sales.setName("张三");
        sales.setId("003");
        sales.toString();
        sales.eat();
        sales.work();

        //有参构造方法
        Sales sales1 = new Sales("李四");
        sales1.toString();
        sales1.eat();
        sales1.work();

    }

}