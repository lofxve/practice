package com.lofxve.classtest.collectionsdome;

import com.sun.media.sound.SoftTuning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName CollectionsDome
 * @Author lofxve
 * @Date 2020/12/17 20:04
 */
public class CollectionsDome {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("3");
        list.add("1");
        list.add("4");
        list.add("2");
        System.out.println(list);

        // 升序排序
        Collections.sort(list);
        System.out.println(list);

        // 随机打乱顺序
        Collections.shuffle(list);
        System.out.println(list);

        // 降序排序
        // 排序方式一
        Collections.sort(list, (o1, o2) -> {
            return o2.compareTo(o1);
        });
        System.out.println(list);

        // 排序方式二
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o2.compareTo(o1);
            }
        });
        System.out.println(list);

        // addAll
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
    }
}