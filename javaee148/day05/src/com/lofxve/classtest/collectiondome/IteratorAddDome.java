package com.lofxve.classtest.collectiondome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @ClassName IteratorAddDome
 * @Author com.lofxve
 * @Date 2020/12/17 10:28
 */
public class IteratorAddDome {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();

        collection.add("wzd");
        collection.add("fx");
        collection.add("sdf");
        collection.add("fx");
        collection.add("sdfsagv");
        collection.add("asbraz");
        collection.add("ager");

        ListIterator<String> iterator = collection.listIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("wzd")){
                iterator.remove();
                iterator.add("wzd123");
            }
        }
        System.out.println(collection);
    }
}