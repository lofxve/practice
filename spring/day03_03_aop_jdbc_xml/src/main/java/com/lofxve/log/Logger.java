package com.lofxve.log;

/**
 * @ClassName Logger
 * @Author lofxve
 * @Date 2021/1/8 22:07
 * @Version 1.0
 */
public class Logger {
    public void beforeMethod() {
        System.out.print("在切点之前运行》");
    }

    public void afterReturning() {
        System.out.print("===》方法正常执行");
    }

    public void afterThrowing() {
        System.out.print("===》方法执行异常");
    }

    public void afterMethod() {
        System.out.println("《在切点之后运行");
    }
}