package com.lofxve.task.task01.test03;

import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @ClassName Person
 * @Author 魏振东
 * @Date 2020/12/13 18:33
 */
public abstract class Person {
    private String name;
    private String sex;
    private String age;

    public Person() {
    }

    public Person(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void sleep(){
        System.out.println("睡觉");
    }
    public abstract void eat();
}