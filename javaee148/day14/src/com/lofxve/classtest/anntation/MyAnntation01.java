package com.lofxve.classtest.anntation;

/**
 * 定义一个有属性的注解
 * <p>
 * 注解中没有变量和方法
 * 注解中是有属性的，属性可以看成抽象方法的格式，但是包含默认值
 * <p>
 * 定义格式
 * public @interface MyAnntation01 {
 * 修饰符 数据类型 属性名（） default 默认值；
 * }
 * 1修饰符：固定使用public abstract 可以省略不写，也可以写一部分
 * 建议写写出，增强阅读性
 * 2、数据类型
 * 基本数据类型：4类8种
 * 引用数据类型
 * 以及以上所有类型的一纬数组
 */
public @interface MyAnntation01 {
    public abstract int a();

    public abstract String[] string();

    public abstract double d() default 8.8;
}
