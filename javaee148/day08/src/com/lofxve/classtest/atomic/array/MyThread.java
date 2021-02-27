package com.lofxve.classtest.atomic.array;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @ClassName MyThread
 * @Author lofxve
 * @Date 2020/12/21 11:05
 */
public class MyThread extends Thread {
    public static AtomicIntegerArray a = new AtomicIntegerArray(1000);
    @Override
    public void run() {
        for (int i = 0; i < a.length(); i++) {
            a.addAndGet(i,1);
        }
        System.out.println(Thread.currentThread().getName() + "线程执行线程任务结束了!");
    }
}