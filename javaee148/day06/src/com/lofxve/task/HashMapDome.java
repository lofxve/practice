package com.lofxve.task;

import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMapDome
 * @Author lofxve
 * @Date 2020/12/18 12:14
 */
public class HashMapDome {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(1, "王五");
        //打印集合大小；
        System.out.println(map.size());
        //使用“键找值”的方式遍历集合，打印键和值；
        for (Integer integer : map.keySet()) {
            System.out.println(integer + " " + map.get(integer));
        }
        //使用“键值对”的方式遍历集合，打印键和值；
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
        }
        //获取键为1的值，并打印
        if (map.containsKey(1)) {
            System.out.println(map.get(1));
        }
        if (map.containsKey(1)) {
            System.out.println(map.get(1));
        }
        //删除键为1的键值对，删除完毕打印集合
        map.remove(1);
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
        }
    }
}