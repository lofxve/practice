package com.lofxve.base.thread.visible;

public class MyThread extends Thread{
    //定义一个静态变量,供所有的线程共享使用
//    public static int a = 0;

//    volatile 关键字解决可见性问题
    public static volatile int a = 0;

    @Override
    public void run() {
        System.out.println("Thread-0线程开始执行,睡眠2秒钟,等待main线程线程执行!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-0线程,2秒钟之后开始执行,修改变量a的值为1!");
        a=1;
        System.out.println("Thread-0线程,执行线程任务结束了!"+a);
    }
}