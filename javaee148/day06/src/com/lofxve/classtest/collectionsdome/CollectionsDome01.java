package com.lofxve.classtest.collectionsdome;

import com.sun.org.apache.xerces.internal.xs.LSInputList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName CollectionsDome01
 * @Author lofxve
 * @Date 2020/12/18 8:56
 */
public class CollectionsDome01 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",20));
        list.add(new Person("张三",19));
        list.add(new Person("张三",35));
        list.add(new Person("张三",12));
        list.add(new Person("张三",24));
        // Person 实现 Comparator接口
        Collections.sort(list);

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                int a = o1.getName().compareTo(o2.getName());
//                if (a == 0){
//                    a = o2.getAge()-o1.getAge();
//                }
//                return a;
//            }
//        });
        System.out.println(list);
    }
}