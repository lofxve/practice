package com.lofxve.task.readandewrite;

/**
 * @ClassName Student
 * @Author lofxve
 * @Date 2020/12/25 10:02
 * @Version 1.0
 */
public class Student {
private String name;
private String sex;
private String age;
private String score;

    public Student() {
    }

    public Student(String name, String sex, String age, String score) {
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
        return  name + '\'' +
                ", '" + sex + '\'' +
                ", '" + age + '\'' +
                ", '" + score + '\'';
    }
}