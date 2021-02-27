package com.lofxve.base.Stream.Serializable;

import java.io.Serializable;

public class Dome implements Serializable {
    private static final long serialVersionUID = 2709425275741743919L;
    private String name;

    @Override
    public String toString() {
        return "Dome{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    private String age;
    private String number;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
