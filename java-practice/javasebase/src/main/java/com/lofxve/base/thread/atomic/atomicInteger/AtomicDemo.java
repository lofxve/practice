package com.lofxve.base.thread.atomic.atomicInteger;
/**
 *  AtomicInteger 可以解决原子性，可见性，有序性
 * @ClassName: AtomicDemo
 * @Auther: weizhendong
 * @Date: 17:11 2020/12/4
 **/
public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i<10000;i++){
            MyThread.money.getAndIncrement();
        }
        Thread.sleep(2000);
        System.out.println(MyThread.money.get());
    }
}
