package com.lofxve.classtest.runnabledome.impl;

import java.security.cert.TrustAnchor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName TicketRunnable
 * @Author lofxve
 * @Date 2020/12/18 18:07
 */
public class TicketRunnable implements Runnable {
    private static int ticket = 100;

    private ReentrantLock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            /**
             * 第一种方式  同步代码块 锁对象 
             **/
//            synchronized (this){
//                if (ticket>0){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"正在买第"+ticket--+"张票..");
//                }else{
//                    break;
//                }
//            }
            /**
             * 第二种方式 同步方法
             **/
//            payTicketStatic1();
//            if (ticket <= 0) {
//                break;
//            }
            /**
             * 第三种方式 lock
             **/
            if (ticket > 0) {
                l.lock();
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "正在买第" + ticket-- + "张票..");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }

            } else {
                break;
            }
        }
    }

    /**
     * 第二种方式 同步方法
     * 锁对象本身
     **/
    public synchronized void payTicketStatic() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "正在买第" + ticket-- + "张票..");
    }

    /**
     * 第二种方式 静态同步方法
     * 锁的是通过反射加载的对象，因为静态方法优先加载到内存中
     **/
    public static void payTicketStatic1() {
        synchronized (TicketRunnable.class) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在买第" + ticket-- + "张票..");

        }
    }
}