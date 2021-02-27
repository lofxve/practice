package com.lofxve.classtest.objectstream;

import com.lofxve.classtest.objectstream.pojo.Person;

import java.io.*;
import java.util.ArrayList;

/**
 * @ClassName ArraylistPerson
 * @Author lofxve
 * @Date 2020/12/25 20:46
 * @Version 1.0
 */
public class ArraylistPerson {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("张三", "10", "dsfui", "78"));
        people.add(new Person("李四", "10", "dsfui", "786"));
        people.add(new Person("张三", "10", "dsfui", "6"));
        people.add(new Person("王五", "10", "dsfui", "857"));

        // 序列化
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("day11/list.txt"));
        objectOutputStream.writeObject(people);
        objectOutputStream.flush();
        objectOutputStream.close();

        // 反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("day11/list.txt"));
        Object o = objectInputStream.readObject();
        ArrayList<Person> personArrayList = (ArrayList<Person>) o;
        personArrayList.forEach(System.out::println);
        objectInputStream.close();
    }
}