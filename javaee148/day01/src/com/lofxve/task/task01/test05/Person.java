package com.lofxve.task.task01.test05;

/**
 * @ClassName Person
 * @Author 魏振东
 * @Date 2020/12/12 16:54
 */
public abstract class Person {
//    姓名、性别、工号和工资；
    private String name;
    private int id;
    private String sex;
    private String wage;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex='" + sex + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public Person(String name, int id, String sex, String wage) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.wage = wage;
    }

    public Person() {
    }
    public abstract void work();
}