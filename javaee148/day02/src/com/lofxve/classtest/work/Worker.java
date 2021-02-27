package com.lofxve.classtest.work;

/**
 * @ClassName Worker
 * @Author 魏振东
 * @Date 2020/12/13 14:40
 */
public abstract class Worker implements Base{
    String name;

    public abstract void work();

    public void show() {
        System.out.println("worker---->show()...");
    }
}