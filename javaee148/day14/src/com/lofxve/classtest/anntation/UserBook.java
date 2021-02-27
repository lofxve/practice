package com.lofxve.classtest.anntation;

import javafx.scene.AmbientLight;

import javax.swing.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName UserBook
 * @Author lofxve
 * @Date 2020/12/31 15:09
 * @Version 1.0
 */
@Book(value = "斗破苍穹", authors = {"天蚕土豆", "斗罗大陆"})
public class UserBook {
    @Book(value = "斗破苍穹", authors = "唐家三少")
    private String name;

    @Book(value = "西游记", price = 200,authors = "吴承恩")
    public void show() {

    }
    public static void sshow() {
        // 获取class文件
        Class userBookClass = UserBook.class;
        // 获取方法名称
        Method[] methods = userBookClass.getMethods();
        // 遍历所有方法
        for (Method method : methods) {
            System.out.println(method.getName());
            if (method.isAnnotationPresent(Book.class)){
                // getAnnotation获取Book注解
                Book book = method.getAnnotation(Book.class);
                // 获取注解的属性值
                System.out.println(book.value());
                System.out.println(book.price());
                System.out.println(Arrays.toString(book.authors()));
            }
        }

    }
    public static void main(String[] args) {
        Class userBookClass = UserBook.class;
        // 是否有注解
        boolean annotation = userBookClass.isAnnotationPresent(Book.class);
        System.out.println(annotation);

        if (annotation){
            // getAnnotation获取Book注解
            Book book = (Book)userBookClass.getAnnotation(Book.class);
            // 获取注解的属性值
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(book.authors());
        }
        sshow();
    }
}