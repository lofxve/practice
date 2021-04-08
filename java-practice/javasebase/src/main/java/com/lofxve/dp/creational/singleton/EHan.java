package com.lofxve.dp.creational.singleton;

/**
 * @ClassName EHan
 * @Author lofxve
 * @Date 2021/4/8 14:21
 * @Version 1.0
 */
public class EHan {
    private static EHan instance = new EHan();

    private EHan() {

    }

    public static EHan getInstance() {
        return instance;
    }
}
