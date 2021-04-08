package com.lofxve.dp.creational.singleton;

/**
 * @ClassName LHan
 * @Author lofxve
 * @Date 2021/4/8 14:22
 * @Version 1.0
 */
public class LHan {
    private static LHan instance = null;

    private LHan() {

    }

    public static synchronized LHan getInstance() {
        if (instance == null) {
            instance = new LHan();
        }
        return instance;
    }
}
