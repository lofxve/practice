package com.lofxve.classtest.stream;

/**
 * @ClassName Person
 * @Author lofxve
 * @Date 2020/12/22 14:59
 */
public class Person {
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}