package com.lofxve.dp.structural.proxy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.proxy
 * @ClassName: RealSubject
 * @Author: lofxve
 * @Description: 真实主题
 * @Date: 2021/4/9 13:56
 * @Version: 1.0
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
