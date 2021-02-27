package com.lofxve.task.task02.test03;

/**
 * @ClassName Person
 * @Author 魏振东
 * @Date 2020/12/12 19:47
 */
public abstract class Person {
//    员工编号、姓名、性别、年龄
    private String id;
    private String name;
    private String sex;
    private String age;

    public Person() {
    }

    public Person(String id, String name, String sex, String age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public abstract void eat ();
}