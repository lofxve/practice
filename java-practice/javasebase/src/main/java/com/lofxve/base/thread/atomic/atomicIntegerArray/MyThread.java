package com.lofxve.base.thread.atomic.atomicIntegerArray;


import java.util.concurrent.atomic.AtomicIntegerArray;

public class MyThread extends Thread{
//    public static int arr[] = new int[1000];
    public static AtomicIntegerArray arr = new AtomicIntegerArray(1000);//{0,0,0...0}
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始改变数组中元素的值!");
        //2.遍历数组,使用Thread-x线程把数组中元素的值依次++
        for (int i = 0; i < arr.length(); i++) {
//            arr[i]++;//{0,0,0,0...0}==>{1,1,1,1...1}
            arr.addAndGet(i,1);
        }
        System.out.println(Thread.currentThread().getName()+"线程执行线程任务结束了!");
    }
}
