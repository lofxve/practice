package com.lofxve.classtest.lombok;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/31 17:29
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("柳岩");
        p1.setAge(18);
        p1.setSex("女");
        System.out.println(p1);//Person(name=柳岩, age=18, sex=女)

        Person p2 = new Person("迪丽热巴",18,"女");
        System.out.println(p2);//Person(name=迪丽热巴, age=18, sex=女)
    }
}