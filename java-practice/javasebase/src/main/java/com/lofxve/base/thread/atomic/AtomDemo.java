package com.lofxve.base.thread.atomic;

public class AtomDemo {
    public static void main(String[] args) throws InterruptedException {
        //创建MyThread对象
        MyThread mt = new MyThread();
        //调用start方法,开启新的线程,执行run方法
        mt.start();

        System.out.println("main线程在开启Thread-0线程之后,继续执行main方法中的代码!");
        System.out.println("main线程修改变量money的值!");
        //3.main线程把money的值增加10000
        for (int i = 0; i < 10000; i++) {
            MyThread.money++;
        }
        System.out.println("main线程修改变量money的值结束!");
        System.out.println("main线程睡眠2秒钟,等待Thread-0线程执行完毕,在统计结果!");
        Thread.sleep(2000);
        //4.查看money的最终结果
        System.out.println("money的最终的结果是:"+MyThread.money);
    }
}
