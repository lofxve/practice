package com.lofxve.task;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @ClassName MyStack
 * @Author com.lofxve
 * @Date 2020/12/17 19:28
 */
public class MyStack<T> {
    ArrayList<T> arrayList = new ArrayList<T>();

    void push(T t) {
        arrayList.add(t);
    }

    T pop() {
        return arrayList.get(arrayList.size()-1);
    }

    public int size() {
        return arrayList.size();
    }

}