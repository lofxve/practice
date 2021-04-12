package com.lofxve.dp.structural.composite;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.composite
 * @ClassName: Component
 * @Author: lofxve
 * @Description: 抽象构件
 * @Date: 2021/4/12 10:56
 * @Version: 1.0
 */
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}
