package com.lofxve.classtest.threaddome;

/**
 * @ClassName InterruptDome
 * @Author lofxve
 * @Date 2020/12/19 13:57
 */
public class InterruptDome {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        Thread.sleep(1000);
        myThread1.interrupt();
        myThread1.join();
        System.out.println("end");
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        HelloThread helloThread = new HelloThread();
        helloThread.start();
        try {
            /**
             * 此线程处于等待状态，如果此时接受到  t.interrupt();会立即抛出中断异常
             **/
            helloThread.join();
        } catch (InterruptedException e) {
            System.out.println("此线程处于等待状态，如果此时接受到  t.interrupt();会立即抛出中断异常");
        }
        helloThread.interrupt();
    }
}
class HelloThread extends Thread{
    @Override
    public void run() {
        int n = 0;
        while (!interrupted()){
            n++;
            System.out.println(n+" hello!");
        }
    }
}