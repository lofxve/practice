package com.lofxve;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Main
 * @Author lofxve
 * @Date 2020/12/18 15:26
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 创建线程池 
         **/
        ExecutorService es = Executors.newFixedThreadPool(3);

        /**
         * 创建任务 
         **/
        Runnable haha = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.print("哈哈");
                }
                System.out.println(Thread.currentThread().getName() + "任务执行结束");
            }
        };

        /**
         * 提交任务 
         **/
        es.submit(haha);

        /**
         * 关闭线程池
         **/
        es.shutdown();

    }
}