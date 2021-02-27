package com.lofxve.classtest.collectiondome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName IteratorRemoveDome
 * @Author com.lofxve
 * @Date 2020/12/17 9:41
 */
public class IteratorRemoveDome {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("wzd");
        collection.add("fx");
        collection.add("sdf");
        collection.add("fx");
        collection.add("sdfsagv");
        collection.add("asbraz");
        collection.add("ager");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            if (next.equals("wzd")){
                iterator.remove();
            }
        }
        System.out.println(collection);
    }
}