package com.lofxve.classtest.concurrent.arrayList;

/**
 * @ClassName CopyOnWriteArrayList
 * @Author lofxve
 * @Date 2020/12/21 16:16
 */
public class CopyOnWriteArrayListDome {
    /**
     * ArrayList 出现的问题
     * 索引越界异常
     * 底层实现是数组，数组在copy的时候
     **/
    public static void main(String[] args) throws InterruptedException {
        NewRunnable newRunnable = new NewRunnable();
        new Thread(newRunnable).start();
        for (int i = 0; i < 1000; i++) {
            NewRunnable.arrayList.add(i);
            Thread.sleep(1);
        }
        System.out.println(Thread.currentThread().getName()+"执行结束");
        Thread.sleep(4000);
        System.out.println(NewRunnable.arrayList.size());
    }

}