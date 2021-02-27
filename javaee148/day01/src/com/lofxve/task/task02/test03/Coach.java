package com.lofxve.task.task02.test03;

/**
 * @ClassName Coach
 * @Author 魏振东
 * @Date 2020/12/12 19:49
 */
public class Coach extends Person{

    public Coach() {
    }

    public Coach(String id, String name, String sex, String age) {
        super(id, name, sex, age);
    }

    @Override
    public void eat() {
        System.out.println("吃工作餐");
    }
}