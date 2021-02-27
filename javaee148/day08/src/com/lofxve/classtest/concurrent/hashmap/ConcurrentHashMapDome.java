package com.lofxve.classtest.concurrent.hashmap;


/**
 * @Author lofxve
 * @Date 2020/12/21 16:16
 */
public class ConcurrentHashMapDome {
    public static void main(String[] args) throws InterruptedException {
        NewRunnable newRunnable = new NewRunnable();
        new Thread(newRunnable).start();
        for (int i = 1000; i < 2000; i++) {
            NewRunnable.map.put(i,i);
            Thread.sleep(1);
        }
        System.out.println(Thread.currentThread().getName()+"执行结束");
        Thread.sleep(4000);
        System.out.println(NewRunnable.map.size());
    }

}