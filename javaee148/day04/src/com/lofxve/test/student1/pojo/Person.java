package com.lofxve.test.student1.pojo;

import com.lofxve.test.student1.util.Utils;

import java.util.Objects;

/**
 * @ClassName Person
 * @Author 魏振东
 * @Date 2020/12/15 15:42
 */
public abstract class Person {
    //id(编号)
    private int id;
    //name(姓名)
    private String name;
    //sex(性别)
    private String sex;
    //birthday(生日)
    private String birthday;
    //age(年龄-由生日计算得出)
    private int age;

    public Person() {
    }

    public Person(int id, String name, String sex, String birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        this.age = Utils.birthdayToAge(this.birthday);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id+'\t'+'\t'+
                name+'\t'+'\t'+
                sex+'\t'+'\t'+
                birthday+'\t'+'\t'+
                getAge()+'\t'+'\t'+
                "我是一名: "+getType()+" ,我的工作是: "+getWork();
    }

    public abstract String getType ();
    public abstract String getWork ();
}