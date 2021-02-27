package com.lofxve.classtest.myfunction;

/**
 * @ClassName MyFunction
 * @Author lofxve
 * @Date 2020/12/19 12:55
 */
public interface MyFunction<T> {
    /**
     * 只有一个抽象函数的接口
     **/
    public abstract void show(T t);
}