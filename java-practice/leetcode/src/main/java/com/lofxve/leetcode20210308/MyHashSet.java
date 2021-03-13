package com.lofxve.leetcode20210308;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 705. 设计哈希集合
 * 不使用任何内建的哈希表库设计一个哈希集合（HashSet）。
 * 实现 MyHashSet 类：
 * void add(key) 向哈希集合中插入值 key 。
 * bool contains(key) 返回哈希集合中是否存在这个值 key 。
 * void remove(key) 将给定值 key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
 *
 * @ClassName MyHashSet
 * @Author lofxve
 * @Date 2021/3/13 15:52
 * @Version 1.0
 */
public class MyHashSet {
    private static final int BASE = 769;
    private LinkedList[] data;

    public MyHashSet() {
        // 初始化数组
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; ++i) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        // hash 存放位置
        int hash = hash(key);
        Iterator<Integer> iterator = data[hash].iterator();
        // 如果存在这个key,直接不存储
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                return;
            }
        }
        data[hash].offerLast(key);
    }

    public void remove(int key) {
        int hash = hash(key);
        Iterator<Integer> iterator = data[hash].iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == key) {
                data[hash].remove(next);
                return;
            }
        }
    }

    public boolean contains(int key) {
        int hash = hash(key);
        Iterator<Integer> iterator = data[hash].iterator();
        while (iterator.hasNext()) {
            Integer next = (Integer) iterator.next();
            if (next == key) {
                return true;
            }
        }
        return false;
    }

    private static int hash(int k) {
        return k % BASE;
    }
}
