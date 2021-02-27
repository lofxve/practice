package com.lofxve.classtest.runnabledome;

import com.lofxve.classtest.runnabledome.impl.MyRunnable02;
import com.lofxve.classtest.runnabledome.impl.MyThread;

/**
 * @ClassName AtomicIntegerDome
 * @Author lofxve
 * @Date 2020/12/18 17:04
 */
public class AtomicIntegerDome {
    public static void main(String[] args) {
        MyRunnable02 myRunnable02 = new MyRunnable02();
        new Thread(myRunnable02).start();
        new Thread(myRunnable02).start();
        new Thread(myRunnable02).start();
//        new MyThread().start();
        for (int i = 0; i < 10000; i++) {
            MyRunnable02.money.getAndIncrement();//i++
        }
        System.out.println(MyRunnable02.money.get());
    }
}