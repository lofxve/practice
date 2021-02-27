package com.lofxve.beans;

/**
 * @ClassName BookFactory
 * @Author lofxve
 * @Date 2021/1/3 22:04
 * @Version 1.0
 */
public class BookFactory {
    /**
     * 创建对象的三种方式
     *
     * 1. 直接使用new关键字创建
     * 2. 使用静态工厂创建
     * 3. 使用实例化工厂创建
     */
    //  2. 使用静态工厂创建
    public static Book getBook1(){
        return new Book();
    }

    // 3. 使用实例化工厂创建
    public  Book getBook2(){
        return new Book();
    }

}