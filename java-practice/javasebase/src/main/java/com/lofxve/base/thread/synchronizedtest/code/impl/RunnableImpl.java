package com.lofxve.base.thread.synchronizedtest.code.impl;

public class RunnableImpl implements Runnable{

    public static int ticket = 1000;
    String s = "fx";
    @Override
    public void run() {
        while (true){
            synchronized (s){
                if (ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"章票！");
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}