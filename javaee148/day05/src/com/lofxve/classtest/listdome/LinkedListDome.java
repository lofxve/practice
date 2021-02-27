package com.lofxve.classtest.listdome;

import java.util.LinkedList;

/**
 * @ClassName LinkedListDome
 * @Author com.lofxve
 * @Date 2020/12/17 19:50
 */
public class LinkedListDome {


    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        linked.add("ddd");
        linked.addFirst("zzz");
        System.out.println(linked);//[aaa, bbb, ccc, ddd]
        if (!linked.isEmpty()) {//return size() == 0;
            String first = linked.getFirst();
            System.out.println("first:" + first);//first:aaa

            String last = linked.getLast();
            System.out.println("last:" + last);//last:ddd
        }

        if (linked.size() != 0) {
            String first = linked.getFirst();
            System.out.println("first:" + first);//first:aaa

            String last = linked.getLast();
            System.out.println("last:" + last);//last:ddd
        }
    }
}