package com.lofxve.classtest.threadpool;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @ClassName CallableThreadPoolDome
 * @Author lofxve
 * @Date 2020/12/18 20:09
 */
public class CallableThreadPoolDome {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        /**
         * 创建线程池 
         **/
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        /**
         * 创建任务 
         **/
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(25 + 1);
            }
        };
        /**
         * 执行任务 
         **/
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(tpe.submit(callable).get());
        }
        /**
         * 关闭线程池
         **/
        tpe.shutdown();

        long end = System.currentTimeMillis();
        System.out.println(arrayList);
        System.out.println(end - start);
    }
}