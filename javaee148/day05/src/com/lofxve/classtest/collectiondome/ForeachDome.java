package com.lofxve.classtest.collectiondome;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName ForeachDome
 * @Author com.lofxve
 * @Date 2020/12/17 10:45
 */
public class ForeachDome {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("wzd");
        collection.add("fx");
        collection.add("sdf");
        collection.add("fx");
        collection.add("sdfsagv");
        collection.add("asbraz");
        collection.add("ager");
        System.out.println(123);
        collection.forEach(o->{
            System.out.println(o);
        });
        for (String s : collection) {
            System.out.println(s);
        }
//        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next);
//            if (next.equals("wzd")){
//                iterator.remove();
//            }
//        }
        System.out.println(collection);
    }
}