package com.lofxve.classtest.abstractdome.work;

/**
 * @ClassName Sales
 * @Author 魏振东
 * @Date 2020/12/11 10:52
 */
public class Sales extends Worker {
    public Sales(String name) {
        super.setId("009");
        super.setName(name);
    }

    public Sales() {
        super();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(super.getId() + "收货人员" + super.getName() + "在吃饭");
    }

    @Override
    public void work() {
        System.out.println(super.getId() + "收货人员" + super.getName() + "收货人员在工作");
    }
}