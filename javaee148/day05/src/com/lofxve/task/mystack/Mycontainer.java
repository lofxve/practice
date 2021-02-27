package com.lofxve.task.mystack;

import sun.dc.pr.PRError;

import java.util.Collection;

/**
 * @ClassName Mycontainer
 * @Author com.lofxve
 * @Date 2020/12/17 19:34
 */
public class Mycontainer<E> {
    private Object[] objects = new Object[10];
    private int index = 0;
    public void add(E e){
        if (index >= objects.length){
            int v = (int) (objects.length * 1.5);
            Object[] newobjects = new Object[v];
            System.arraycopy(objects,0,newobjects,0,objects.length);
            objects = newobjects;
        }
        objects[index++] = e;
    }

    public E get(int i){
        if (i>index || i<0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) objects[i];
    }
    public int size(){
        return index;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < index ; i ++){
            sb.append(objects[i].toString()).append(",");
        }
        return sb.replace(sb.length()-1, sb.length(), "]").toString();
    }
}