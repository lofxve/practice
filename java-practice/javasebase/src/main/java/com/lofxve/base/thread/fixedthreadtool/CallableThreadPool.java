package com.lofxve.base.thread.fixedthreadtool;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @ClassName CallableThreadPool
 * @Author 魏振东
 * @Date 2020/12/10 19:04
 */
public class CallableThreadPool {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 定义结果集
        ArrayList<Future<Integer>> futureArrayList = new ArrayList<>();

        // 创建10个任务并执行
        for (int i = 0; i < 10; i++) {
            // 匿名内部类 创建Callable产生
            Future<Integer> ft = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return new Random().nextInt(10);
                }
            });
            futureArrayList.add(ft);
        }

        for (Future<Integer> integerFuture : futureArrayList) {
            try {
                while (!integerFuture.isDone()) {
                }
                ;
                System.out.println(integerFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }
        }
    }

}