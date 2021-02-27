package com.lofxve.classtest.genenicdome;

/**
 * @ClassName GenericInterfaceimpl
 * @Author com.lofxve
 * @Date 2020/12/17 14:46
 */
public class GenericInterfaceimpl<T> implements GenericInterface<T>{

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}