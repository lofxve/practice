package com.lofxve.base.thread.fixedthreadtool;

import com.lofxve.base.thread.fixedthreadtool.impl.RunnableImpl;

import java.util.concurrent.*;

/**
 * @ClassName ThreadPoolRunnable
 * @Author 魏振东
 * @Date 2020/12/10 11:34
 */
public class ThreadPoolRunnable {
    @SuppressWarnings("AlibabaThreadShouldSetName")
    public static void main(String[] args) {
        /**
         * 创建线程池
         **/
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(5, 10,
                100, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        /**
         * 创建任务
         **/
        RunnableImpl runnable = new RunnableImpl();
        /**
         * 提交一个 Runnable 任务用于执行
         **/
        tpe.submit(runnable);
        tpe.submit(runnable);
        tpe.submit(runnable);
        tpe.submit(runnable);
        tpe.submit(runnable);
        tpe.submit(runnable);
        tpe.submit(runnable);
        tpe.submit(runnable);
        /**
         * 异步执行 可以有返回值
         **/
        tpe.execute(runnable);

        /**
         *  销毁线程池
         **/
        tpe.shutdown();


        /**
         * 创建固定数目线程的线程池。
         **/
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "正在执行。。。。");
                }
            }
        });
        executorService.shutdown();

    }

}