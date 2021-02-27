package com.lofxve.classtest.concurrent.arrayList;


import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName NewRunnable
 * @Author lofxve
 * @Date 2020/12/21 16:17
 */
public class NewRunnable implements Runnable {
    public static CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);//0-999
            try {
                Thread.sleep(1);//让程序每次添加完元素,睡眠1毫秒,为了提高安全问题出现的几率
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"执行结束");

    }
}