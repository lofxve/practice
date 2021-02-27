package com.lofxve.beans;

import org.junit.Test;

/**
 * @ClassName App
 * @Author lofxve
 * @Date 2021/1/3 22:08
 * @Version 1.0
 */
public class App {
    /**
     * 创建对象的三种方式
     *
     * 1. 直接使用new关键字创建
     * 2. 使用静态工厂创建
     * 3. 使用实例化工厂创建
     */
    @Test
    public void getBook(){
        // 直接使用new关键字创建
        Book book = new Book();
        System.out.println(book);

        // 使用静态工厂创建
        Book book1 = BookFactory.getBook1();
        System.out.println(book1);

        // 使用实例化工厂创建
        BookFactory bookFactory = new BookFactory();
        Book book2 = bookFactory.getBook2();
        System.out.println(book2);
    }
}