package com.lofxve.task.task01.test02;

/**
 * @ClassName Dad
 * @Author 魏振东
 * @Date 2020/12/12 14:45
 */
public class Dad extends Person{
    public Dad(String name, String sex, int age, String address) {
        super(name, sex, age, address);
    }

    public Dad() {
    }

    @Override
    public void work() {
        System.out.println("老张通过种地养家");
    }
}