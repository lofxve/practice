package com.lofxve.task.task01.test05;

/**
 * @ClassName C
 * @Author 魏振东
 * @Date 2020/12/13 19:24
 */
public class C implements A,B{
    public int count;
    @Override
    public void show() {
        System.out.println(count);
    }


    @Override
    public void add(int a, int b) {
        count = a+b;
    }
}