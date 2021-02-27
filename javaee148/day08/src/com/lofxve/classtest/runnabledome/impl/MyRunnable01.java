package com.lofxve.classtest.runnabledome.impl;

/**
 * @ClassName MyRunnable01
 * @Author lofxve
 * @Date 2020/12/18 16:55
 */
public class MyRunnable01 implements Runnable{
    public volatile static int k = 0;
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        k=1;
    }
}