package com.lofxve.classtest.objectdome;

import java.util.Objects;

/**
 * @ClassName Student
 * @Author 魏振东
 * @Date 2020/12/14 9:52
 */
public class Student {
    private String name;
    private String age;

    public Student(String pink) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名='" + name + '\'' +
                ", 年龄='" + age + '\'' +
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

    public Student(String name, String age) {
        System.out.println(getClass().getName());
        this.name = name;
        this.age = age;
    }
}