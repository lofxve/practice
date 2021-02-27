package com.lofxve.base.xiancheng.runnable;

public class InterruptDome {
    public static void main(String[] args) throws InterruptedException {
        MainThread t = new MainThread();
        t.start();
        Thread.sleep(1000);
        // 1、向MainThread()发出中断请求
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}
class MainThread extends Thread{
    @Override
    public void run() {
        InterruptMyThread interruptMyThread = new InterruptMyThread();
        interruptMyThread.start();
        try{
            // 2、此时interruptMyThread.join()正在等待，接收到中断请求，抛出中断异常
            interruptMyThread.join();
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
        // 3、main执行即将结束，通知InterruptMyThread中断
        interruptMyThread.interrupt();
        System.out.println("MainThread end");
    }
}
class InterruptMyThread extends Thread{
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()){
            System.out.println("打印第"+n+"次");
            n++;
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                break;
            }
        }
    }
}
