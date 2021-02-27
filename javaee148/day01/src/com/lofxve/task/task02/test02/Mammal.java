package com.lofxve.task.task02.test02;

/**
 * @ClassName Mammal
 * @Author 魏振东
 * @Date 2020/12/12 19:35
 */
public class Mammal extends Animal{
    @Override
    public void move() {
        System.out.println("跑");
    }
    public void ru(){
        System.out.println("哺乳动物");
    }
}