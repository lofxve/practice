package com.lofxve.task.task02.test03;

/**
 * @ClassName Animal
 * @Author 魏振东
 * @Date 2020/12/13 20:27
 */
public class Animal {
    private String name;
    private String age;
    private String sex;

    public Animal() {
    }

    public Animal(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("吃饭");
    }
}