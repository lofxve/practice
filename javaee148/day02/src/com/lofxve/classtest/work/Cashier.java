package com.lofxve.classtest.work;

/**
 * @ClassName Cashier
 * @Author 魏振东
 * @Date 2020/12/13 14:43
 */
public class Cashier extends Worker implements Finance {

    @Override
    public void work() {
        System.out.println("收银");
    }

    @Override
    public void count() {
        System.out.println("收银员特有属性");
    }
}