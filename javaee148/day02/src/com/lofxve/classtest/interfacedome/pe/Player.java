package com.lofxve.classtest.interfacedome.pe;

/**
 * @ClassName Player
 * @Author 魏振东
 * @Date 2020/12/11 15:14
 */
public class Player extends Person {
    private String ballage;
    private String sex;

    public Player() {
    }

    public Player(String ballage, String sex) {
        this.ballage = ballage;
        this.sex = sex;
    }

    public Player(String name, String age, String ballage, String sex) {
        super(name, age);
        this.ballage = ballage;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBallage() {
        return ballage;
    }

    public void setBallage(String ballage) {
        this.ballage = ballage;
    }

    @Override
    public void eat() {
        System.out.println("运动员吃营养餐");
    }
}