package com.lofxve.classtest.runnabledome.impl;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyRunnable02
 * @Author lofxve
 * @Date 2020/12/18 17:04
 */
public class MyRunnable02 implements Runnable {
    //    public static int money = 0;
    public static AtomicInteger money = new AtomicInteger(0);
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10000; i++) {
            money.getAndIncrement();//i++
        }
    }
}