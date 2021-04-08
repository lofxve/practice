package com.lofxve.dp.creational.singleton;

/**
 * @ClassName DCL
 * @Author lofxve
 * @Date 2021/4/8 14:28
 * @Version 1.0
 */
public class DCL {
    private static DCL instance = null;

    private DCL() {
    }

    public static DCL getInstance() {
        if (instance == null) {
            synchronized (DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }
}
