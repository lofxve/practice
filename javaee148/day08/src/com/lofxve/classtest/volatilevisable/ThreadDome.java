package com.lofxve.classtest.volatilevisable;

/**
 * @ClassName ThreadDome
 * @Author lofxve
 * @Date 2020/12/21 8:47
 */
public class ThreadDome {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        while (true){
            if (MyThread.a!=0){
                break;
            }
        }
    }
}