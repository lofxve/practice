package com.lofxve.dp.structural.adapter.objectadapter;

import com.lofxve.dp.structural.adapter.Adaptee;
import com.lofxve.dp.structural.adapter.Target;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.adapter.objectadapter
 * @ClassName: ObjectAdapter
 * @Author: lofxve
 * @Description: 对象适配器类
 * @Date: 2021/4/9 10:23
 * @Version: 1.0
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
