package com.lofxve.classtest.runnabledome.impl;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyThread
 * @Author lofxve
 * @Date 2020/12/18 17:16
 */
public class MyThread extends Thread {
    public static AtomicInteger money = new AtomicInteger(0);

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10000; i++) {
            money.getAndIncrement();
        }
    }
}