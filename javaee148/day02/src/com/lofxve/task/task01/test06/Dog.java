package com.lofxve.task.task01.test06;

/**
 * @ClassName Dog
 * @Author 魏振东
 * @Date 2020/12/13 19:29
 */
public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookHome(){
        System.out.println("老老实实看家");
    }
}