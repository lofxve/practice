package com.lofxve.task.task01.test07;

/**
 * @ClassName Ability
 * @Author 魏振东
 * @Date 2020/12/12 17:38
 */
public class Ability {
    private String name;
    private double multiple;
    private int mpConsume;

    public Ability() {
    }
    public Ability(String name, double multiple, int mpConsume) {
        this.name = name;
        this.multiple = multiple;
        this.mpConsume = mpConsume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMultiple() {
        return multiple;
    }

    public void setMultiple(double multiple) {
        this.multiple = multiple;
    }

    public int getMpConsume() {
        return mpConsume;
    }

    public void setMpConsume(int mpConsume) {
        this.mpConsume = mpConsume;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "name='" + name + '\'' +
                ", multiple=" + multiple +
                ", mpConsume=" + mpConsume +
                '}';
    }
}