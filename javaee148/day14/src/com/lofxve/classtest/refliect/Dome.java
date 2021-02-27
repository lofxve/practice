package com.lofxve.classtest.refliect;

import java.util.ArrayList;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/31 11:07
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazzarray = Class.forName("java.util.ArrayList");
        // 获取类实现的接口
        for (Class anInterface : clazzarray.getInterfaces()) {
            System.out.println(anInterface);
        }
    }
}