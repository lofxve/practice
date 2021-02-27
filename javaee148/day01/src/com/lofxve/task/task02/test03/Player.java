package com.lofxve.task.task02.test03;

/**
 * @ClassName Player
 * @Author 魏振东
 * @Date 2020/12/12 19:50
 */
public class Player extends Person{
    private String className;

    public Player() {
    }

    public Player(String className) {
        this.className = className;
    }

    public Player(String id, String name, String sex, String age, String className) {
        super(id, name, sex, age);
        this.className = className;
    }

    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }
}