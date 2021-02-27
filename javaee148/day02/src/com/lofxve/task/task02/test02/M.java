package com.lofxve.task.task02.test02;

/**
 * @ClassName M
 * @Author 魏振东
 * @Date 2020/12/13 20:19
 */
public class M extends Mc{
    public M() {
    }

    public M(String type, String price) {
        super(type, price);
    }

    @Override
    public void run() {
        System.out.println("摩托车运行");
    }
}