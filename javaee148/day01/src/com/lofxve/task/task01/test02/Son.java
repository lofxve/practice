package com.lofxve.task.task01.test02;

/**
 * @ClassName Son
 * @Author 魏振东
 * @Date 2020/12/12 14:43
 */
public class Son extends Person{
    public Son(String name, String sex, int age, String address) {
        super(name, sex, age, address);
    }

    public Son() {
    }

    @Override
    public void work() {
        System.out.println("小张通过写代码挣钱养家");
    }
}