package com.lofxve.dp.creational.factory.simplefactory;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ClassName Computer
 * @Author lofxve
 * @Date 2021/4/8 10:20
 * @Version 1.0
 */
public class Computer implements Product{
    @Override
    public void fun() {
        System.out.println("我是电脑");
    }
}
