package com.lofxve.dp.structural.adapter;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.adapter
 * @ClassName: Adaptee
 * @Author: lofxve
 * @Description: 适配者接口
 * @Date: 2021/4/9 10:11
 * @Version: 1.0
 */
public class Adaptee
{
    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}
