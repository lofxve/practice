package com.lofxve.base.thread.atomic;

public class MyThread extends Thread{
    //1.定义多线程共享的静态变量money
    public static int money = 0;

    @Override
    public void run() {
        System.out.println("Thread-0线程开始执行,修改变量money的值!");
        //2.Thread-0线程把money的值增加10000
        for (int i = 0; i < 10000; i++) {
            money++;//0==>1==>2==>3==>...==>10000
        }
        System.out.println("Thread-0线程执行线程任务结束!");
    }
}