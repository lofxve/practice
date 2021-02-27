package com.lofxve.task.task02.test02;

/**
 * @ClassName Bird
 * @Author 魏振东
 * @Date 2020/12/12 19:26
 */
public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("飞");
    }
    public void ru(){
        System.out.println("鸟类");
    }
}