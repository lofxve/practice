package com.lofxve.base.xiancheng.runnable.base;

public class Mythread extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("mythread start....");
            // 会出现中断异常
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}