package com.lofxve.classtest.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyThread
 * @Author lofxve
 * @Date 2020/12/21 9:37
 */
public class MyThread extends Thread{
//    public static int money = 0;
    public static AtomicInteger money = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            money.getAndIncrement();
        }
    }
}