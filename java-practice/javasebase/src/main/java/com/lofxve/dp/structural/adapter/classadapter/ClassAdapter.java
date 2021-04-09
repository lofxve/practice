package com.lofxve.dp.structural.adapter.classadapter;

import com.lofxve.dp.structural.adapter.Adaptee;
import com.lofxve.dp.structural.adapter.Target;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.adapter
 * @ClassName: ClassAdapter
 * @Author: lofxve
 * @Description: 适配器类
 * @Date: 2021/4/9 10:11
 * @Version: 1.0
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request()
    {
        specificRequest();
    }
}
