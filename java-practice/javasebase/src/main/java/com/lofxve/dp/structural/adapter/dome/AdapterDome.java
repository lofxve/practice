package com.lofxve.dp.structural.adapter.dome;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.adapter.dome
 * @ClassName: AdapterDome
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/14 13:32
 * @Version: 1.0
 */
interface Target{
    public void request();
}
class Adapter{
    public void fun(){
        System.out.println("适配器中业务代码被调用");
    }
}
// 类适配
class AdapterTarget extends Adapter implements Target{

    @Override
    public void request() {
        super.fun();
    }
}
public class AdapterDome {
    public static void main(String[] args) {
        AdapterTarget adapterTarget = new AdapterTarget();
        adapterTarget.fun();
    }
}
