package com.lofxve.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName CollectionsDome
 * @Author lofxve
 * @Date 2020/12/18 12:01
 */
public class CollectionsTask {
    public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(415);
        arrayList.add(345);
        arrayList.add(3);
        arrayList.add(456);
        arrayList.add(65);
        arrayList.add(97);
    //对集合中的数据打乱顺序；
        Collections.shuffle(arrayList);
    //打印集合
        System.out.println(arrayList);
    //对集合中的数据进行升序排序
        Collections.sort(arrayList);
    //打印集合
        System.out.println(arrayList);
    //对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    //打印集合
        System.out.println(arrayList);
    }
}