package com.lofxve.classtest.runnabledome.impl;

/**
 * @ClassName Runnableimpl
 * @Author lofxve
 * @Date 2020/12/20 16:57
 */
public class Runnableimpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"===>"+i);
        }
    }
}