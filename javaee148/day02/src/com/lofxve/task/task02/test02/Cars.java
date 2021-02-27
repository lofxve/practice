package com.lofxve.task.task02.test02;

/**
 * @ClassName Cars
 * @Author 魏振东
 * @Date 2020/12/13 20:18
 */
public class Cars extends Mc{
    public Cars() {
    }

    public Cars(String type, String price) {
        super(type, price);
    }

    @Override
    public void run() {
        System.out.println("汽车运行");
    }
}