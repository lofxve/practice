package com.lofxve.classtest.abstractdome.player;

/**
 * @ClassName Player
 * @Author 魏振东
 * @Date 2020/12/11 15:14
 */
public abstract class Player {
    private String name;
    private String ballage;
    private String age;
    private String sex;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", ballage='" + ballage + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public Player() {
    }

    public Player(String name, String age, String sex, String ballage) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ballage = ballage;
    }

    public abstract void work();
}