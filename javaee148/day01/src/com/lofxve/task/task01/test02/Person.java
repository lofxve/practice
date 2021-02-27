package com.lofxve.task.task01.test02;

/**
 * @ClassName Person
 * @Author 魏振东
 * @Date 2020/12/12 14:35
 */
public class Person {
    //姓名、性别、年龄、地址
    private String name;
    private String sex;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, String sex, int age, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    private int age;
    private String address;
    public void work(){
        System.out.println("养家");
    }
}