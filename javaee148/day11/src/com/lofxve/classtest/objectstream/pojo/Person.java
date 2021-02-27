package com.lofxve.classtest.objectstream.pojo;

import java.io.Serializable;

/**
 * @ClassName Person
 * @Author lofxve
 * @Date 2020/12/25 12:17
 * @Version 1.0
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String sex;
    private String age;
    /**
     * transient 阻止成员序列化
     * static 不属于对象，保存在静态区
     */
    private transient String score;

    public Person() {
    }

    public Person(String name, String sex, String age, String score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}