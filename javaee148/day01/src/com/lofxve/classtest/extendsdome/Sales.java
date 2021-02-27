package com.lofxve.classtest.extendsdome;

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
        System.out.println(this.getId() + "收货人员" + this.getName() + "在吃饭");
    }

    @Override
    public void work() {
        System.out.println(this.getId() + "收货人员" + this.getName() + "收货人员在工作");
    }
}