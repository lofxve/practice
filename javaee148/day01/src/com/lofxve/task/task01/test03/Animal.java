package com.lofxve.task.task01.test03;

/**
 * @ClassName Animal
 * @Author 魏振东
 * @Date 2020/12/12 16:15
 */
public abstract class Animal {
    //    名字、年龄、性别、毛色
    private String name;
    private int age;
    private String sex;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, int age, String sex, String color) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.color = color;
    }

    public Animal() {
    }

    private String color;

    public void sleep() {
        System.out.println("睡觉");
    }

    public abstract void eat();

    public abstract void call();
}