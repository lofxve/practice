package com.lofxve.dp.structural.proxy.dome;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.proxy.dome
 * @ClassName: ProxyDome
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/14 14:00
 * @Version: 1.0
 */
interface Subject {
    void fun();
}

class NewSubject implements Subject {

    @Override
    public void fun() {
        System.out.print("真实的方法");
    }
}

class proxy implements Subject {
    private NewSubject newSubject = null;

    proxy(NewSubject newSubject) {
        this.newSubject = newSubject;
    }

    @Override
    public void fun() {
        before();
        newSubject.fun();
        after();
    }
    public void before(){
        System.out.print("在运行方法之前===>");
    }
    public void after(){
        System.out.print("====>在运行方法之后");
    }
}

public class ProxyDome {
    public static void main(String[] args) {
        NewSubject subject = new NewSubject();
        proxy proxy = new proxy(subject);
        proxy.fun();
    }
}
