package com.lofxve.dp.structural.proxy.dome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.proxy.dome
 * @ClassName: DynamicProxyDome
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/14 14:27
 * @Version: 1.0
 */
interface Subject1 {
    void fun();
}

class NewSubject1 implements Subject1 {

    @Override
    public void fun() {
        System.out.print("真实的方法");
    }
}

class ProxyHandler implements InvocationHandler {
    private Object object = null;

    ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("在运行方法之前===>");
        method.invoke(object, args);
        System.out.print("====>在运行方法之后");
        return object;
    }
}

public class DynamicProxyDome {
    public static void main(String[] args) {
        // 真实的类
        NewSubject1 newSubject1 = new NewSubject1();
        // 代理类
        ProxyHandler proxyHandler = new ProxyHandler(newSubject1);
        // 组装 真实类的类加载器，真实类的接口，代理类
        Subject1 o = (Subject1) Proxy.newProxyInstance(newSubject1.getClass().getClassLoader(), newSubject1.getClass().getInterfaces(), proxyHandler);
        o.fun();
    }
}
