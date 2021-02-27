package com.lofxve.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName Task01
 * @Author com.lofxve
 * @Date 2020/12/17 15:28
 */
public class Task01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
//        “JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，
//		”Java架构师之路”
        coll.add("JavaEE企业级开发指南");
        coll.add("Oracle高级编程");
        coll.add("MySQL从入门到精通");
        coll.add("Java架构师之路");
        Iterator<String> iterator = coll.iterator();
        //使用迭代器遍历所有元素，并打印
//        show(iterator);
        //使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
//        show01(iterator);
        //使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
//        show02(iterator);
        //如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
        show03(iterator);
        for (String s : coll) {
            System.out.println(s);
        }
    }

    private static void show03(Iterator<String> iterator) {
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.contains("Oracle")){
                iterator.remove();
            }
        }
    }

    private static void show02(Iterator<String> iterator) {
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.contains("Java")){
                System.out.println(next);
            }
        }
    }

    private static void show01(Iterator<String> iterator) {
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.length()<10){
                System.out.println(next);
            }
        }
    }

    private static void show(Iterator<String> iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}