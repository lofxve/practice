package com.lofxve.base.jige;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDome {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("wzd");
        arrayList.add("fx");
        arrayList.add("dffdd");
        arrayList.add("wzd");
        arrayList.add("fx");
        arrayList.add("dffdd");
        // 迭代器遍历
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // for
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        // 增强for
        for (String s : arrayList) {
            System.out.println(s);
        }
        // forearch
        arrayList.forEach(l->{
            System.out.println(l);
        });
        // List变为Array
        String[] array = arrayList.toArray(new String[arrayList.size()]);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
