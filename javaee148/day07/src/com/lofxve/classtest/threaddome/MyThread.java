package com.lofxve.classtest.threaddome;

/**
 * @ClassName MyThread
 * @Author lofxve
 * @Date 2020/12/18 15:51
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getId()+"===>"+i);
        }
    }
}