package com.lofxve.task.task02.test03;

/**
 * @ClassName Cat
 * @Author 魏振东
 * @Date 2020/12/13 20:29
 */
public class Cat extends Animal{
    public void catchMouse(){
        System.out.println("桌老鼠");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}