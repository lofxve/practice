package com.lofxve.task.task01.test03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ClassName STeacher
 * @Author 魏振东
 * @Date 2020/12/13 18:50
 */
public class STeacher extends Teacher implements Smoke {

    public STeacher() {
    }

    public STeacher(String name, String sex, String age) {
        super(name, sex, age);
    }

    @Override
    public void smoking() {
        System.out.println("抽烟老师");
    }
}