package com.lofxve.classtest.classdome;

/**
 * @ClassName Person
 * @Author 魏振东
 * @Date 2020/12/13 18:33
 */
public class Person {
    public String name;
    public String sex;
    public String age;

    public Person() {
        System.out.println("空参数构造方法");
    }
    private Person(String name) {
        this.name = name;
        System.out.println("私有构造方法");
    }

    public Person(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        System.out.println("全参数构造方法");
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
}