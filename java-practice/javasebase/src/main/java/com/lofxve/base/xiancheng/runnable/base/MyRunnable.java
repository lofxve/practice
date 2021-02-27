package com.lofxve.base.xiancheng.runnable.base;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("myRunnable start....");
            // 会出现中断异常
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}