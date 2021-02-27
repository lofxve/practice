package com.lofxve.classtest.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName RunnableImpl
 * @Author lofxve
 * @Date 2020/12/21 10:12
 */
public class RunnableImpl implements Runnable{
    public static AtomicInteger money = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            money.getAndIncrement();
        }
    }
}