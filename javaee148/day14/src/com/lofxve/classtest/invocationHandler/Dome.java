package com.lofxve.classtest.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/31 16:42
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) {
        CaiXuKun caiXuKun = new CaiXuKun();
        // 生产蔡徐坤的代理人
        Star cxkProxy = (Star) Proxy.newProxyInstance(caiXuKun.getClass().getClassLoader(),
                caiXuKun.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        System.out.println(name);
                        if ("changGe".equals(name)) {
                            System.out.println("蔡徐坤在鸟巢changGe");
                            return null;
                        }
                        if ("tiaoWu".equals(name)) {
                            System.out.println("蔡徐坤在鸟巢tiaoWu");
                            throw new RuntimeException("不能跳舞");
                        } else {
                            Object invoke = method.invoke(caiXuKun, args);
                            return invoke;
                        }
                    }
                });
        cxkProxy.changGe();
        cxkProxy.rap();
        cxkProxy.zhiBoDaiHuo(12);
        cxkProxy.tiaoWu();
    }
}