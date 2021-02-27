package com.lofxve.classtest.ticketdome.impl;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName TicketRunnable
 * @Author lofxve
 * @Date 2020/12/21 14:45
 */
public class TicketRunnable implements Runnable{
    public static int ticket = 100;

    ReentrantLock l =  new ReentrantLock();
    @Override
    public void run() {
        while (true){
            /**
             * 同步代码块
             **/
//            synchronized (this){
//                if (ticket>0){
//                    try {
//                        Thread.sleep(100);
//                        System.out.println(Thread.currentThread().getName()+"正在买第"+ticket--+"张票");
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }else{
//                    break;
//                }
//            }
//            payTicket4();
//            if(ticket<=0){
//                break;
//            }
//
            /**
             * lock
             **/
            if (ticket>0){
                l.lock();
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"正在买第"+ticket--+"张票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
            }else{
                break;
            }
            
        }
    }
    /**
     * 普通同步方法 
     **/
    public synchronized void payTicket1(){
        if (ticket>0){
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+"正在买第"+ticket--+"张票");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     *方法包含同步代码块
     **/
    public void payTicket2(){
        synchronized(this){
            if (ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"正在买第"+ticket--+"张票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 静态方法包含同步代码块
     **/
    public static void payTicket3(){
        synchronized(TicketRunnable.class){
            if (ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"正在买第"+ticket--+"张票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 静态同步方法
     **/
    public synchronized static void payTicket4(){
        if (ticket>0){
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+"正在买第"+ticket--+"张票");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}