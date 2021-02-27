package com.lofxve.classtest.timer;

import java.util.Date;

/**
 * @ClassName TimerRunnanble
 * @Author lofxve
 * @Date 2020/12/19 14:22
 */
public class TimerRunnanble {
    /**
     * 守护线程是为其他线程服务的线程；
     *
     * 所有非守护线程都执行完毕后，虚拟机退出；
     *
     * 守护线程不能持有需要关闭的资源（如打开文件等）。 
     **/
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(new Date());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);// 创建守护线程
        thread.start();
    }
}