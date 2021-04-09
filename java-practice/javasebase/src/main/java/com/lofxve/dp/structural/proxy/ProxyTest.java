package com.lofxve.dp.structural.proxy;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.proxy
 * @ClassName: ProxyTest
 * @Author: lofxve
 * @Description: 代理测试
 * @Date: 2021/4/9 13:58
 * @Version: 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 静态代理：抽象主题，具体主题，代理
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}
