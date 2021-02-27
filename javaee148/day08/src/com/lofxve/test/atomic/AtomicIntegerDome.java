package com.lofxve.test.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName AtomicIntegerDome
 * @Author lofxve
 * @Date 2020/12/21 17:33
 */
public class AtomicIntegerDome {
//    public static int a = 0;
    public static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
//                    a++;
                    atomicInteger.getAndIncrement();
                }
                System.out.println(Thread.currentThread().getName()+"执行结束");
            }
        }).start();
        for (int i = 0; i < 10000; i++) {
//           a++;
            atomicInteger.getAndIncrement();
        }
        Thread.sleep(100);
//        System.out.println(a);
        System.out.println(atomicInteger.get());
    }
}