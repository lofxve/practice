package com.lofxve.task.task01.test01;

/**
 * @ClassName A
 * @Author 魏振东
 * @Date 2020/12/13 18:22
 */
public interface A {
    public abstract void showA();
    public default void showB(){
        System.out.println("BBBB");
    }
}