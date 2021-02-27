package com.lofxve.classtest.finaldome;

/**
 * @ClassName dome
 * @Author 魏振东
 * @Date 2020/12/11 16:16
 */
public class dome {
    // final
    // 修饰类不能被继承
    // 修饰方法子类可以被继承，但是不能被重写
    // 修饰成员属性/成员变量，不能被修改
    //      成员变量:必须在创建对象前赋值,只能赋值一次
    public static void main(String[] args) {
        /**
         *  收银员
         **/
        // 无参数构造
        com.lofxve.classtest.abstractdome.work.Cashier cashier = new com.lofxve.classtest.abstractdome.work.Cashier();
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
        com.lofxve.classtest.extendsdome.Sales sales = new com.lofxve.classtest.extendsdome.Sales();
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