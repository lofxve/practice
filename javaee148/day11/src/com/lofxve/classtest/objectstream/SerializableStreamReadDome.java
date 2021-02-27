package com.lofxve.classtest.objectstream;

import com.lofxve.classtest.objectstream.pojo.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName SerializableStreamReadDome
 * @Author lofxve
 * @Date 2020/12/25 14:15
 * @Version 1.0
 */
public class SerializableStreamReadDome {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("day11/person.txt"));
        Object o = objectInputStream.readObject();
        Person p = (Person)o;
        System.out.println(p);
    }
}