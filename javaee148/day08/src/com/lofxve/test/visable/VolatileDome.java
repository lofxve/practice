package com.lofxve.test.visable;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/21 17:25
 */
public class VolatileDome {
    /**
     * volatile 关键字可以解决不可见性，无序性，单是不能解决原子性 
     **/
    public volatile static int a = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                a = 1;
                System.out.println(Thread.currentThread().getName() + "执行结束");
            }
        }).start();

        while (true) {
            /**
             * while 方法的执行太快导致访问不到主内存中的新值
             **/
//            Thread.sleep(10);
            if (a != 0) {
                break;
            }
        }
    }
}