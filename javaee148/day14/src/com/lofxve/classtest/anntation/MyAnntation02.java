package com.lofxve.classtest.anntation;

public @interface MyAnntation02 {
    public abstract String[] value();

    public abstract double d() default 8.8;
}
