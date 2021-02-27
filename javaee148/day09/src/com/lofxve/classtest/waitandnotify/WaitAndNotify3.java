package com.lofxve.classtest.waitandnotify;

import java.security.PublicKey;

/**
 * @ClassName WaitAndNotify3
 * @Author lofxve
 * @Date 2020/12/22 10:02
 */
public class WaitAndNotify3 {
    public static void main(String[] args) throws InterruptedException {
        String lock = "lock";
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + "开始执行线程任务了");
                    try {
                        // 调用之后进入无线等待状态
                        lock.wait();
                        System.out.println("等待之后的程序");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "开始执行线程任务结束了");
                }
            }
        }).start();

        Thread.sleep(3000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + "开始执行线程任务了");

                    try {
                        // 唤醒lock锁对象上等待的线程
                        lock.notifyAll();
                        System.out.println("唤醒之后的程序");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "开始执行线程任务结束了");
                }
            }
        }).start();

    }
}