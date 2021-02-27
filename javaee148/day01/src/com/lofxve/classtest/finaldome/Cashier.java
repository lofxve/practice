package com.lofxve.classtest.finaldome;


/**
 * @ClassName Cashier
 * @Author 魏振东
 * @Date 2020/12/11 10:55
 */
public class Cashier extends Worker {
    public Cashier(String name, String id) {
        super(name, id);
    }

    public Cashier() {
    }

    @Override
    public void work() {
        System.out.println("公司"+super.getGongsi()+" id"+super.getId() + "收银员" + super.getName() + "收银员在工作");
    }
}