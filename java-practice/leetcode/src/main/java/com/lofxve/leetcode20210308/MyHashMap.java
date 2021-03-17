package com.lofxve.leetcode20210308;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName MyHashMap
 * @Author lofxve
 * @Date 2021/3/15 10:33
 * @Version 1.0
 */
class MyHashMap {
    private class Pair {
        private int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    private static final int BASE = 769;
    private LinkedList[] data;

    public MyHashMap() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; ++i) {
            data[i] = new LinkedList<Pair>();
        }
    }

    public void put(int key, int value) {
        int hash = hash(key);
        Iterator<Pair> iterator = data[hash].iterator();
        while (iterator.hasNext()) {
            Pair next = iterator.next();
            if (next.getKey() == key) {
                next.setValue(value);
                return;
            }
        }
        data[hash].offerLast(new Pair(key, value));
    }

    public int get(int key) {
        int hash = hash(key);
        Iterator<Pair> iterator = data[hash].iterator();
        while (iterator.hasNext()) {
            Pair next = iterator.next();
            if (next.getKey() == key) {
                return next.getValue();
            }
        }
        return -1;
    }

    public void remove(int key) {
        int hash = hash(key);
        Iterator<Pair> iterator = data[hash].iterator();
        while (iterator.hasNext()) {
            Pair next = iterator.next();
            if (next.getKey() == key) {
                data[hash].remove(next);
                return;
            }
        }
    }

    private static int hash(int key) {
        return key % BASE;
    }
}
