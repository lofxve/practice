package com.lofxve.base.thread.atomic.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

/*
    AtomicInteger解决变量的原子性
 */
public class MyThread extends Thread{
    //1.定义多线程共享的静态变量money,使用AtomicInteger类型
    public static AtomicInteger money = new AtomicInteger(0);

    @Override
    public void run() {
        System.out.println("Thread-0线程开始执行,修改变量money的值!");
        //2.Thread-0线程把money的值增加10000
        for (int i = 0; i < 10000; i++) {
            money.getAndIncrement();//i++==>0==>1==>2==>3==>...==>10000
        }
        System.out.println("Thread-0线程执行线程任务结束!");
    }
}