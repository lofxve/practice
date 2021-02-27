package com.lofxve.task.task02.Test07;

import java.util.Objects;

/**
 * @ClassName Student
 * @Author 魏振东
 * @Date 2020/12/15 10:43
 */
public class Student {
    private String name;
    private int age;
    private double height;
    private boolean hun;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, double height, boolean hun, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hun = hun;
        this.sex = sex;
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHun() {
        return hun;
    }

    public void setHun(boolean hun) {
        this.hun = hun;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.height, height) == 0 &&
                hun == student.hun &&
                sex == student.sex &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, hun, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hun=" + hun +
                ", sex=" + sex +
                '}';
    }
}