package com.lofxve.classtest.collections;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProxyList
 * @Author lofxve
 * @Date 2020/12/31 17:44
 * @Version 1.0
 */
public class ProxyList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");

        // 返回一个不能修改的集合
        // 底层使用的并不是动态代理
        List<String> strings1 = ProxyList.proxyList(strings);

        System.out.println(strings1.get(2));
        System.out.println(strings1.size());

        strings1.add("c");
    }

    public static List<String> proxyList(List<String> list) {
        Object add_no_run = Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if ("add".equals(name)) {
                    throw new UnsupportedOperationException("add no run!");
                }
                if ("remove".equals(name)) {
                    throw new UnsupportedOperationException("remove no run!");
                }
                if ("set".equals(name)) {
                    throw new UnsupportedOperationException("set no run!");
                }
                return method.invoke(list, args);
            }
        });
        return (List<String>) add_no_run;
    }
}