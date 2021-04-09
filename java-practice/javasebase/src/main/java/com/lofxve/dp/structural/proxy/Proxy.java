package com.lofxve.dp.structural.proxy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.proxy
 * @ClassName: Proxy
 * @Author: lofxve
 * @Description: 代理
 * @Date: 2021/4/9 13:57
 * @Version: 1.0
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
