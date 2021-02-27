package com.lofxve.task.task01.test05;

/**
 * @ClassName Coker
 * @Author 魏振东
 * @Date 2020/12/12 16:57
 */
public class Cokder extends Person{
    public Cokder(String name, int id, String sex, String wage) {
        super(name, id, sex, wage);
    }

    public Cokder() {
    }

    @Override
    public void work() {
        System.out.println("开发");
    }
}