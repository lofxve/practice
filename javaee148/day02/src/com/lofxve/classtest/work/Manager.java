package com.lofxve.classtest.work;

/**
 * @ClassName Manager
 * @Author 魏振东
 * @Date 2020/12/13 14:48
 */
public class Manager extends Worker{

    @Override
    public void work() {
        System.out.println("开会");
    }

    public void talk(Worker worker){
        System.out.println("我跟："+worker.name+"在谈话！");
    }
}