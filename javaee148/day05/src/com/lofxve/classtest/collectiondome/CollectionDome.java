package com.lofxve.classtest.collectiondome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;

/**
 * @ClassName CollectionDome
 * @Author com.lofxve
 * @Date 2020/12/17 9:05
 */
public class CollectionDome {
    public static void main(String[] args) {
        /**
         * 有序
         * 允许存储重复元素
         *
         **/
        Collection<String> collection = new ArrayList<>();

        collection.add("wzd");
        collection.add("fx");
        collection.add("sdf");
        collection.add("fx");
        collection.add("sdfsagv");
        collection.add("asbraz");
        collection.add("ager");

        collection.remove("asbraz");
        System.out.println(collection.contains("sdf"));

        System.out.println(Arrays.toString(collection.toArray()));

        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
    }
}