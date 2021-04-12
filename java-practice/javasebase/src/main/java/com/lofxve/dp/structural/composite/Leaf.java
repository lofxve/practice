package com.lofxve.dp.structural.composite;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.composite
 * @ClassName: Leaf
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/12 10:57
 * @Version: 1.0
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
    }

    @Override
    public void remove(Component c) {
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
