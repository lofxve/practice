package com.lofxve.classtest.threaddome;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/18 15:51
 */
public class Dome {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        new MyThread().start();
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"===>"+i);
        }
    }
}