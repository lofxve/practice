package com.lofxve.classtest.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest
 * @Author lofxve
 * @Date 2020/12/22 15:05
 */
public class StreamTest {
    /*
        Stream综合案例:不使用Stream流的方式
        现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）
        依次进行以下若干操作步骤：
        1. 第一个队伍只要名字为3个字的成员姓名,把3个字成员的姓名存储到一个新的集合中
        2. 第一个队伍筛选之后只要前3个人,把前3个人存储到一个新的集合中
        3. 第二个队伍只要姓张的成员姓名,把姓张的成员姓名存储到一个新的集合中
        4. 第二个队伍筛选之后不要前2个人,跳过前2个人,把其余的人存储到一个新的集合中
        5. 将两个队伍合并为一个队伍,把两个过滤之后集合组合为一个新的集合
        6. 根据姓名创建 Person 对象,把Person对象存储到一个新的集合
        7. 打印整个队伍的Person对象信息。
     */
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");
        one.add("张无忌");
        one.add("周伯通");
        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");
//        1. 第一个队伍只要名字为3个字的成员姓名,把3个字成员的姓名存储到一个新的集合中
        List<String> collect = one.stream().filter(o -> o.length() == 3).collect(Collectors.toList());
        collect.forEach(o -> System.out.print(o + " "));
        System.out.println();
//        2. 第一个队伍筛选之后只要前3个人,把前3个人存储到一个新的集合中
        List<String> collect1 = collect.stream().limit(3).collect(Collectors.toList());
        collect1.forEach(o -> System.out.print(o + " "));
        System.out.println();
//        3. 第二个队伍只要姓张的成员姓名,把姓张的成员姓名存储到一个新的集合中
        List<String> zhang = two.stream().filter(o -> o.contains("张")).collect(Collectors.toList());
        zhang.forEach(o -> System.out.print(o + " "));
        System.out.println();
//        4. 第二个队伍筛选之后不要前2个人,跳过前2个人,把其余的人存储到一个新的集合中
        List<String> collect2 = collect.stream().skip(3).collect(Collectors.toList());
        collect2.forEach(o -> System.out.print(o + " "));
        System.out.println();
//        5. 将两个队伍合并为一个队伍,把两个过滤之后集合组合为一个新的集合
        List<String> collect3 = Stream.concat(one.stream(), two.stream()).collect(Collectors.toList());
        collect3.forEach(o -> System.out.print(o + " "));
        System.out.println();
//        6. 根据姓名创建 Person 对象,把Person对象存储到一个新的集合
        List<Person> collect4 = collect3.stream()
                .map(o -> {
                    return new Person(o);
                })
                .collect(Collectors.toList());
        collect4.forEach(o -> System.out.print(o + " "));
//        7. 打印整个队伍的Person对象信息。
    }
}