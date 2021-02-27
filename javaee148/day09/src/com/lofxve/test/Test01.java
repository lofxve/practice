package com.lofxve.test;

import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @ClassName Test01
 * @Author lofxve
 * @Date 2020/12/22 9:41
 */
public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Person person = new Person();
        Student student = new Student();
        System.out.println(Person.a);
        System.out.println(Student.a);
    }
}