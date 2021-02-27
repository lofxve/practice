package com.lofxve.base.thread.fixedthreadtool.impl;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {

    public static int ticket = 10;

    private ReentrantLock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            try {
                if (ticket > 0) {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "章票！");
                    ticket--;
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }
        }
    }
}