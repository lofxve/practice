package com.lofxve.classtest.anntation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//运行时有效
public @interface Book {
    //书名
    public abstract String value();

    //价格，默认值为 100
    public abstract double price() default 100;

    //多位作者
    public abstract String[] authors();
}
