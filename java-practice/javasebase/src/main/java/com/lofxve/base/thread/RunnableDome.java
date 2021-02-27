package com.lofxve.base.thread;

public class RunnableDome {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableImpl(),"fx");
        thread.start();
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
        ).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();

    }
}
