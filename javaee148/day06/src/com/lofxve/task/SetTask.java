package com.lofxve.task;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName SetTask
 * @Author lofxve
 * @Date 2020/12/18 12:05
 */
public class SetTask {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("刘备");
        set.add("关羽");
        set.add("张飞");
        set.add("刘备");
        set.add("张飞");
//打印集合大小
        System.out.println(set.size());
//使用迭代器遍历集合，并打印每个元素
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
//使用增强for遍历集合，并打印每个元素
        for (String s : set) {
            System.out.println(s);
        }
    }
}