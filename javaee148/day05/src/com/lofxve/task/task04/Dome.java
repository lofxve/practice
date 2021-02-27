package com.lofxve.task.task04;

import java.util.ArrayList;

/**
 * @ClassName Dome
 * @Author com.lofxve
 * @Date 2020/12/17 15:57
 */
public class Dome {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Person> list2 = new ArrayList<>();
        ArrayList<Student> list3 = new ArrayList<>();
        ArrayList<JavaStudent> list4 = new ArrayList<>();
        ArrayList<UIStudent> list5 = new ArrayList<>();
        ArrayList<Teacher> list6 = new ArrayList<>();
        ArrayList<JavaTeacher> list7 = new ArrayList<>();
        ArrayList<UITeacher> list8 = new ArrayList<>();
    }
    //要求：参数可以接收任何泛型的ArrayList参数
    public static void print1(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
    //要求：参数可以接收任何Person及其子类泛型的ArrayList参数
    public static void print2(ArrayList<? extends Person> list){
        for (Person person : list) {
            System.out.println(person);
        }
    }
    //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
    public static void print3(ArrayList<? extends Student> list){
        for (Student student : list) {
            System.out.println(student);
        }
    }
    //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
    public static void print4(ArrayList<? extends JavaStudent> list){
        for (JavaStudent javaStudent : list) {
            System.out.println(javaStudent);
        }
    }
}