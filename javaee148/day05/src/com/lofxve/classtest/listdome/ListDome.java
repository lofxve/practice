package com.lofxve.classtest.listdome;

import org.w3c.dom.ls.LSInput;
import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListDome
 * @Author com.lofxve
 * @Date 2020/12/17 16:03
 */
public class ListDome {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        System.out.println(list);

        list.add(4,"哈哈add (index,e)");
        System.out.println(list);


        System.out.println(list.get(0));

        System.out.println(list.remove(0));
        System.out.println(list);

        System.out.println(list.set(0,"index = 0"));
        System.out.println(list);


        System.out.println("迭代器");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("增强for");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("普通for");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}