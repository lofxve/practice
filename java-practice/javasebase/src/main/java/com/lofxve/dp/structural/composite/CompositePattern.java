package com.lofxve.dp.structural.composite;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.composite
 * @ClassName: CompositePattern
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/12 10:58
 * @Version: 1.0
 */
public class CompositePattern {
    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);

        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
