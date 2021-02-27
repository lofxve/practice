package com.lofxve.base.thread.visible;
/**
 *  高并发之不可见性
 *  产生的原因：定义一个变量。一个线程修改变量的值，另一个线程由于访问频率太快，导致一直使用本线程区内的**变量副本**，而没有实时的到主内存中获取变量的新值。
 *  todo Visible 可以解决无序性，可见性，不能解决原子性
 * @ClassName: VisibleDemo
 * @Auther: weizhendong
 * @Date: 20:55 2020/12/3
 **/
public class VisibleDemo {
    public static void main(String[] args) throws InterruptedException {
        //创建MyThread类对象,调用start方法,开启新的线程,执行run方法
        MyThread mt = new MyThread();
        mt.start();

        System.out.println("main线程在开启Thread-0线程之后,继续执行main方法中的代码!");
        System.out.println("main线程开始执行死循环!");
        while (true){
            if(MyThread.a==1){
                System.out.println("main线程判断变量a的值==1,结束死循环!");
                break;
            }
//            Thread.sleep(10);
        }
    }
}
