package com.lofxve.classtest.myfunction.lambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/22 11:08
 */
public class Dome {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("FSA",17));
        people.add(new Person("AD",42));
        people.add(new Person("DA",123));
        people.add(new Person("F",24));
        people.add(new Person("FSAA",23));

        // lambda 简化
        Collections.sort(people,(o1,o2)->{
            return o2.getAge()-o1.getAge();
        });

        people.forEach(o->{
            System.out.println(o);
        });
    }
}