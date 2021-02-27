package com.lofxve.classtest.runnabledome;

import com.lofxve.classtest.runnabledome.impl.Runnableimpl;

/**
 * @ClassName RunnableDome
 * @Author lofxve
 * @Date 2020/12/20 16:56
 */
public class RunnableDome {
    public static void main(String[] args) {
        new Thread(new Runnableimpl()).start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"===>"+i);
        }
    }
}