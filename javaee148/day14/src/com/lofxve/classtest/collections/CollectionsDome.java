package com.lofxve.classtest.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName CollectionsDome
 * @Author lofxve
 * @Date 2020/12/31 17:39
 * @Version 1.0
 */
public class CollectionsDome {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");

        // 返回一个不能修改的集合
        // 底层使用的并不是动态代理
        List<String> strings1 = Collections.unmodifiableList(strings);

        System.out.println(strings1.get(2));
        System.out.println(strings1.size());

        strings1.add("c");
    }
}