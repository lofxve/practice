package com.lofxve.classtest.setdome;

import com.lofxve.classtest.collectionsdome.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @ClassName HashSetDome
 * @Author lofxve
 * @Date 2020/12/17 20:34
 */
public class HashSetDome {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add("c");
        set.add("a");
        set.add("c");
        for (String s : set) {
            System.out.println(s);
        }
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("aaa");
        linked.add("ccc");
        linked.add("ddd");
        System.out.println(linked);//[aaa, bbb, ccc, ddd] 不允许重复,是一个有序集合

        HashSet<Person> set1 = new HashSet<>();
        set1.add(new Person("张三",20));
        set1.add(new Person("张三",20));
        set1.add(new Person("张三",35));
        set1.add(new Person("张三",12));
        set1.add(new Person("张三",24));
    }
}