package com.lofxve.test.synchronizeddom;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName SynchronizedDome
 * @Author lofxve
 * @Date 2020/12/21 17:51
 */
public class SynchronizedDome {
    public static int ticket = 100;
    public static ReentrantLock l = new ReentrantLock();

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    /**
                     * synchrnizede 代码块
                     **/
//                    synchronized (this){
//                        if (ticket > 0) {
//                            try {
//                                Thread.sleep(10);
//                                System.out.println(Thread.currentThread().getName() + "正在买" + ticket-- + "张票。");
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        } else {
//                            break;
//                        }
//                    }
                    /**
                     *lock 锁
                     **/
//                    if (ticket > 0) {
//                        l.lock();
//                        try {
//                            Thread.sleep(10);
//                            System.out.println(Thread.currentThread().getName() + "正在买" + ticket-- + "张票。");
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        } finally {
//                            l.unlock();
//                        }
//                    }else{
//                        System.exit(0);
//                    }
                    /**
                     * 静态同步方法
                     **/
//                    payTicket();
                    /**
                     *静态方法包含同步代码块
                     **/
                    payTicket1();
                    if (ticket<=0){
                        break;
                    }
                }
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
    /**
     * 静态同步方法 
     **/
    public static synchronized void payTicket(){
        if (ticket > 0) {
            l.lock();
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName() + "正在买" + ticket-- + "张票。");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }
        }
    }
    /**
     * 静态方法包含同步代码块
     **/
    public static  void payTicket1(){
        synchronized(SynchronizedDome.class){
            if (ticket > 0) {
                l.lock();
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在买" + ticket-- + "张票。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();
                }
            }
        }
    }
    
}