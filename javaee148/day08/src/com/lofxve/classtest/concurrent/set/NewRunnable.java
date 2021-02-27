package com.lofxve.classtest.concurrent.set;


import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @ClassName NewRunnable
 * @Author lofxve
 * @Date 2020/12/21 16:17
 */
public class NewRunnable implements Runnable {
    public static CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            set.add(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"执行结束");

    }
}