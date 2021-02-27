package com.lofxve.base.thread.atomic.atomicIntegerArray;

public class AtomicIntegerArrayDome {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++){
            new MyThread().start();
        }
        System.out.println("让程序睡眠5秒钟,等待所有的线程都执行完毕,在查看结果!");
        Thread.sleep(5000);
        System.out.println("所有的线程都执行完毕,查看数组中元素的值:");
//        System.out.println(Arrays.toString(MyThread.arr));
        System.out.println(MyThread.arr.toString());
    }

}
