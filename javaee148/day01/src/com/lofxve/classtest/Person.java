package com.lofxve.classtest;

/**
 * @ClassName Person
 * @Author 魏振东
 * @Date 2020/12/11 9:32
 */
public class Person { // 父类

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类代码块");
    }

    private int id;
    private String name;
    private int age;

    public Person() {
        System.out.println("父类构造方法");
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}