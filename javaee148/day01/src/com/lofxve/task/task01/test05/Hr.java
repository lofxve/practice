package com.lofxve.task.task01.test05;

/**
 * @ClassName Hr
 * @Author 魏振东
 * @Date 2020/12/12 16:56
 */
public class Hr extends Person{

    public Hr(String name, int id, String sex, String wage) {
        super(name, id, sex, wage);
    }

    public Hr() {
    }

    @Override
    public void work() {
        System.out.println("招聘");
    }
}