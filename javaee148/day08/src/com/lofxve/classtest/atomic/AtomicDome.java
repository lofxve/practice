package com.lofxve.classtest.atomic;

/**
 * @ClassName AtomicDome
 * @Author lofxve
 * @Date 2020/12/21 9:37
 */
public class AtomicDome {
    public static void main(String[] args) throws InterruptedException {
        RunnableImpl runnable = new RunnableImpl();

        new Thread(runnable).start();

//        MyThread mt = new MyThread();
//        mt.start();

        for (int i = 0; i < 10000; i++) {
            RunnableImpl.money.getAndIncrement();
        }

        Thread.sleep(2000);
        System.out.println("money: "+RunnableImpl.money.get());
    }
}