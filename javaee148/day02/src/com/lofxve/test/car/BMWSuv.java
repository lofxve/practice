package com.lofxve.test.car;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ClassName BMWSuv
 * @Author 魏振东
 * @Date 2020/12/13 16:18
 */
public class BMWSuv extends CarAndSuv implements BMW {
    public BMWSuv() {
    }

    public BMWSuv(String pinpai, String type, String color, String price) {
        super(pinpai, type, color, price);
    }

    @Override
    public void run() {
        System.out.println("宝马SUV最高运行时速：230公里");
    }

    @Override
    public void gps() {
        System.out.println("百度地图为你导航..");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}