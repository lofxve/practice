package com.lofxve.base.thread;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            //线程任务:打印20次线程名称
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
