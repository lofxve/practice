package com.lofxve.dp.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.proxy
 * @ClassName: ProxyHandlerTest
 * @Author: lofxve
 * @Description: 动态代理测试
 * @Date: 2021/4/9 14:02
 * @Version: 1.0
 */
public class ProxyHandlerTest {
    public static void main(String[] args) {
        // 动态代理：抽象主题，真实主题，代理处理器

        // 创建被代理对象
        RealSubject realSubject = new RealSubject();
        // 创建代理处理器
        ProxyHandler proxyHandler = new ProxyHandler(realSubject);
        // 生成代理对象
        Subject o = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), proxyHandler);
        //调用方法
        o.Request();
    }
}
