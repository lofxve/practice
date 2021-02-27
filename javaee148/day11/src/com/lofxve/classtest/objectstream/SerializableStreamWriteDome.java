package com.lofxve.classtest.objectstream;

import com.lofxve.classtest.objectstream.pojo.Person;

import java.io.*;

/**
 * @ClassName SerializableStreamDome
 * @Author lofxve
 * @Date 2020/12/25 12:19
 * @Version 1.0
 */
public class SerializableStreamWriteDome {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "day11/person.txt";
        writer(path);
        reader(path);
    }

    private static void reader(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Object o = objectInputStream.readObject();
        Person p = (Person)o;
        System.out.println(p);
    }

    private static void writer(String path)throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(new Person("张三","10","dsfui","shdfuid"));
        objectOutputStream.close();
    }
}