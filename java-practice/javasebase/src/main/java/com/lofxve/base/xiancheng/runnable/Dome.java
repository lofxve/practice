package com.lofxve.base.xiancheng.runnable;

import com.lofxve.base.xiancheng.runnable.base.MyRunnable;
import com.lofxve.base.xiancheng.runnable.base.Mythread;

public class Dome {
    public static void main(String[] args) {
        // 继承thread类
        Thread thread = new Mythread();
        thread.start();
        // 实现Runnable接口
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
        try{
            System.out.println("main start...");
            Thread t = new Thread() {
                public void run() {
                    System.out.println("com.lofxve.base.thread run...");
                    System.out.println("com.lofxve.base.thread end.");
                }
            };
            t.start();
            t.join();
            System.out.println("main end...");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

