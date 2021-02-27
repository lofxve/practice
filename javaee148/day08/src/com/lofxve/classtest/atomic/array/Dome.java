package com.lofxve.classtest.atomic.array;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/21 11:05
 */
public class Dome {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 1000; i++) {
//            new MyThread().start();//{0,0,0,0...0}==>{1,1,1,1...1}==>{2,2,2,2...2}...==>{1000,1000,1000,...1000}
//        }
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        System.out.println("让程序睡眠5秒钟,等待所有的线程都执行完毕,在查看结果!");
        Thread.sleep(5000);
        System.out.println("所有的线程都执行完毕,查看数组中元素的值:");
        System.out.println(MyThread.a.toString());
    }
}