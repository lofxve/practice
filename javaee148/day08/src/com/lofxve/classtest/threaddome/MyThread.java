package com.lofxve.classtest.threaddome;

/**
 * @ClassName MyThread
 * @Author lofxve
 * @Date 2020/12/21 8:45
 */
public class MyThread extends Thread{
    public static int a = 0;
    @Override
    public void run() {
        System.out.println("sleep 2s");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("修改a的值为1");
        a = 1;
        System.out.println("线程执行完毕");
    }
}