package com.lofxve.classtest.anntation;

/**
 * @ClassName UserMyAnnotation
 * @Author lofxve
 * @Date 2020/12/31 14:56
 * @Version 1.0
 */
@MyAnntation
@MyAnntation01(a = 12,d = 7.6,string = {"12","25","75"})
public class UserMyAnnotation {
    /**
     * 使用自定义注解
     * 统一个位置，同名的注解只能使用一次
     * 不同位置，不同名的注解可以多次使用
     *
     * 没有属性的注解可以使用注解名直接使用
     *
     * 有属性的注解，必须使用键值对的形式给属性赋值之后才能使用
     */
    @MyAnntation02(value = {"12","25","75"} )
    private String name;
    private int age;
}