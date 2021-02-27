package com.lofxve;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Dome {
    public static void main(String[] args) {
        /**
         * 创建固定大小的线程池
         * 核心线程数和最大线程数相等
         */
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new Runnable() {
                                   @Override
                                   public void run() {
                                       System.out.println("哈啊哈");
                                   }
                               }

        );
//        public static ExecutorService newFixedThreadPool(int nThreads) {
//            return new ThreadPoolExecutor(nThreads, nThreads,
//                    0L, TimeUnit.MILLISECONDS,
//                    new LinkedBlockingQueue<Runnable>());
//        }

        /**
         * 创建一个可缓存的线程池
         * 调用execute 将重用以前构造的线程（如果线程可用）。如果没有可用的线程，
         * 则创建一个新线程并添加到池中。终止并从缓存中移除那些已有 60 秒钟未被使用的线程。
         */
        ExecutorService executorService1 = Executors.newCachedThreadPool();
//        public static ExecutorService newCachedThreadPool() {
//            return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                    60L, TimeUnit.SECONDS,
//                    new SynchronousQueue<Runnable>());
//        }

        /**
         * 创建一个单线程化的Executor。
         */
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
//        public static ExecutorService newSingleThreadExecutor() {
//            return new Executors.FinalizableDelegatedExecutorService
//                    (new ThreadPoolExecutor(1, 1,
//                            0L, TimeUnit.MILLISECONDS,
//                            new LinkedBlockingQueue<Runnable>()));
//        }

        /**
         * 创建一个支持定时及周期性的任务执行的线程池，多数情况下可用来替代Timer类。
         */
        ScheduledExecutorService executorService3 = Executors.newScheduledThreadPool(5);
        executorService3.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("哈啊哈");
            }
        },10,10, TimeUnit.SECONDS);


//          public ScheduledThreadPoolExecutor(int corePoolSize) {
//            super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS,
//                    new ScheduledThreadPoolExecutor.DelayedWorkQueue());
//        }
    }
}
