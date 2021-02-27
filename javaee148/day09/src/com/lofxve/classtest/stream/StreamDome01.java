package com.lofxve.classtest.stream;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName StreamDome01
 * @Author lofxve
 * @Date 2020/12/22 14:50
 */
public class StreamDome01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张三丰", "张翠山", "灭绝师太", "张三");

        /**
         * filter
         **/
        list.stream().filter(o -> o.contains("张")).forEach(o -> System.out.print(o + " "));
        System.out.println();


        /**
         *  count
         **/
        long count = list.stream().count();
        System.out.println(count);

        /**
         *  limit
         **/
        list.stream().limit(3).collect(Collectors.toList()).forEach(o -> System.out.print(o + " "));
        System.out.println();

        /**
         * skip
         **/
        list.stream().skip(3).collect(Collectors.toList()).forEach(o -> System.out.print(o + " "));
        System.out.println();

        /**
         * map
         **/
        list.stream()
                .map(o -> {
                    return new Person(o);
                })
                .collect(Collectors.toList())
                .forEach(o -> System.out.println(o.toString()));
        /**
         * concat
         **/
        Stream<String> stream1 = Stream.of("美羊羊", "喜羊羊", "沸羊羊", "懒羊羊", "慢羊羊", "暖羊羊", "灰太狼", "红太狼", "小灰灰");
        Stream.concat(list.stream(),stream1).collect(Collectors.toList()).forEach(o -> System.out.print(o + " "));
    }
}