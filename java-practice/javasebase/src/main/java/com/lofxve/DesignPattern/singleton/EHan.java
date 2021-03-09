package com.lofxve.DesignPattern.singleton;

/**
 * @ClassName EHan
 * @Author lofxve
 * @Date 2021/3/8 21:07
 * @Version 1.0
 */
public class EHan {
    private static EHan instance;

    private EHan() {

    }

    static EHan getInstance() {
        if (instance == null) {
            return new EHan();
        }
        return instance;
    }
}
