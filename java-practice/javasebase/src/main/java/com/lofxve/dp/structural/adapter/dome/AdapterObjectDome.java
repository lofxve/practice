package com.lofxve.dp.structural.adapter.dome;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.adapter.dome
 * @ClassName: AdapterObjectDome
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/14 13:37
 * @Version: 1.0
 */
interface Target1 {
    public void request();
}

class Adapter1 {
    public void fun() {
        System.out.println("适配器中业务代码被调用");
    }
}

class AdapterTarget1 implements Target {
    private Adapter1 adapter1 = null;

    AdapterTarget1(){
        adapter1 = new Adapter1();
    }
    @Override
    public void request() {
        adapter1.fun();
    }
}

public class AdapterObjectDome {
    public static void main(String[] args) {
        AdapterTarget1 adapterTarget1 = new AdapterTarget1();
        adapterTarget1.request();
    }
}
