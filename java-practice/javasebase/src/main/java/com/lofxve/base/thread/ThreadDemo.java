package com.lofxve.base.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        System.out.println(Thread.currentThread().getName());
    }
}
