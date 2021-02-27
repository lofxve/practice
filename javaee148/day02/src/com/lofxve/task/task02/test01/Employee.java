package com.lofxve.task.task02.test01;

/**
 * @ClassName Employee
 * @Author 魏振东
 * @Date 2020/12/13 19:41
 */
public class Employee {
    private String name;
    private String sex;
    private String age;

    public Employee() {
    }

    public Employee(String name, String sex, String age) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}