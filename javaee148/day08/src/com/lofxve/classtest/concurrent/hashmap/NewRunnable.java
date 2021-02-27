package com.lofxve.classtest.concurrent.hashmap;


import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName NewRunnable
 * @Author lofxve
 * @Date 2020/12/21 16:17
 */
public class NewRunnable implements Runnable {
    public static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            map.put(i, i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "执行结束");

    }
}