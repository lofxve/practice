package com.lofxve.DesignPattern.singleton;

/**
 * @ClassName ShuangJianSuo
 * @Author lofxve
 * @Date 2021/3/8 21:11
 * @Version 1.0
 */
public class ShuangJianSuo {
    private static ShuangJianSuo instance;

    private ShuangJianSuo() {

    }

    static ShuangJianSuo getInstance() {
        if (instance == null) {
            synchronized (ShuangJianSuo.class) {
                if (instance == null) {
                    return new ShuangJianSuo();
                }
            }
        }
        return instance;
    }
}
