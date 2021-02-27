package com.lofxve.base.Lambda;

import java.util.stream.Stream;

public class StreamMapDome {
    public static void main(String[] args) {
//        map操作就是把一种操作运算，映射到一个序列的每一个元素上
        Stream.of(1, 2, 3, 4, 5).map(n -> n * n).forEach(System.out::println);

    }
}
