package com.lofxve.dp.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.proxy
 * @ClassName: ProxyHandler
 * @Author: lofxve
 * @Description: 动态代理
 * @Date: 2021/4/9 14:01
 * @Version: 1.0
 */
public class ProxyHandler implements InvocationHandler {
    private Object object;
    public ProxyHandler(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke "  + method.getName());
        method.invoke(object, args);
        System.out.println("After invoke " + method.getName());
        return object;
    }
}
