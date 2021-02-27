package com.lofxve.task.task01.test06;

/**
 * @ClassName Cat
 * @Author 魏振东
 * @Date 2020/12/13 19:31
 */
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("努力捉老鼠");
    }
}