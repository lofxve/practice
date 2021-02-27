package com.lofxve.classtest.threadpool;

import java.util.concurrent.*;

/**
 * @ClassName ThreadPoolDome
 * @Author lofxve
 * @Date 2020/12/18 20:03
 */
public class RunnableThreadPoolDome {
    public static void main(String[] args) {
        /**
         * 创建线程池
         **/
        ExecutorService es = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        /**
         * 创建任务
         **/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "线程开始执行线程任务了!"+i);
                }
            }
        };
        /**
         * 提交任务并执行
         **/
        es.submit(runnable);
        es.submit(runnable);

        /**
         * 清空线程池
         **/
        es.shutdown();
    }
}