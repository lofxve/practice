package com.lofxve.base.thread.synchronizedtest.obj.impl;

public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private static int ticket = 100;

    @Override
    public void run() {
        while (true){
            payTicketStatic();
            if(ticket<=0){
                break;
            }
        }
    }
    /**
     * 同步方法 根据反射锁住对象本身
     * 因为静态方法优先于非静态加载到内存中
     * @Author weizhendong
     * @Date 20:07 2020/12/7
     * @Param []
     * @return void
     **/
    public static void payTicketStatic(){
        synchronized (RunnableImpl.class){
            if(ticket>0){
                //每卖一张票需要10毫秒,让线程睡眠10毫秒
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程正在卖第"+ticket+"张票!");
                ticket--;
            }
        }
    }
    /**
     * 同步方法 根据反射锁住对象本身
     * @Author weizhendong
     * @Date 20:08 2020/12/7
     * @Param []
     * @return void
     **/
    public void payTicketStatic1(){
        synchronized (this){
            if(ticket>0){
                //每卖一张票需要10毫秒,让线程睡眠10毫秒
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程正在卖第"+ticket+"张票!");
                ticket--;
            }
        }
    }
    /**
     *  synchronized 关键字修饰方法
     *  默认锁住对象本身
     * @Author weizhendong
     * @Date 20:09 2020/12/7
     * @Param []
     * @return void
     **/
    public synchronized void payTicketStatic2(){
        if(ticket>0){
            //每卖一张票需要10毫秒,让线程睡眠10毫秒
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程正在卖第"+ticket+"张票!");
            ticket--;
        }
    }
}
