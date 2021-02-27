package com.lofxve.base.thread.synchronizedtest.lock.impl;

import java.util.concurrent.locks.ReentrantLock;

/**
 *  ReentrantLock 锁
 * @className: RunnableImpl
 * @author weizhendong
 * @date: 20:24 2020/12/7
 **/
public class RunnableImpl implements Runnable{

    public static int ticket = 1000;

    private ReentrantLock l = new ReentrantLock();
    @Override
    public void run() {
        while (true){

            if (ticket>0){
                l.lock();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"章票！");
                ticket--;
            }else{
                break;
            }

        }
    }
}