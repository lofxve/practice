package com.lofxve.base.Lambda;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDome {
    public static void main(String[] args) {
        // of构造
        Stream<String> stream = Stream.of("sdfhudi","hdfsuia","sdahfui","sdhfui");
        stream.forEach(System.out::println);

        String[] strings = {"dsfghhdf", "sdfhi", "sdhfio", "asdhfi"};

        // 数组转Stream<String>
        Stream<String>  stringStream = Arrays.stream(strings);
        stringStream.forEach(System.out::println);


        // Collection.stream()
        Stream<String> stringList = Arrays.asList(strings).stream();
        stringList.forEach(System.out::println);
    }
}
