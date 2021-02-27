package com.lofxve.task;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName HashSetTask
 * @Author lofxve
 * @Date 2020/12/18 14:40
 */
public class HashSetTask {
    public static void main(String[] args) {
//        需求：ArrayList有以下元素: "a","f","b","c","a","d"利用HashSet对ArrayList集合去重(最终结果: ArrayList中没有重复元素)。
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "a", "f", "b", "c", "a", "d");
        System.out.println(arrayList);

//        第一种 存入HashSet 集合无序
        HashSet<String> set = new HashSet<>();
        for (String s : arrayList) {
            set.add(s);
        }
        System.out.println(set);

//        第二种 转换成LinkedHashSet 集合有序
        ArrayList<String> arrayList2 = new ArrayList<>(new LinkedHashSet<>(arrayList));
        System.out.println(arrayList2);

//        第三种  流式去重
        arrayList.stream().distinct().forEach(System.out::print);

//        第四种 list中的contains
        ArrayList<String> reslut = new ArrayList<>(arrayList.size());
        for (String s : arrayList) {
            if (!reslut.contains(s)) {
                reslut.add(s);
            }
        }
        System.out.println(reslut);

//        第五种 双重for循环
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (i != j && arrayList.get(i) == arrayList.get(j)) {
                    arrayList.remove(arrayList.get(j));
                }
            }
        }
        System.out.println(arrayList);
    }
}