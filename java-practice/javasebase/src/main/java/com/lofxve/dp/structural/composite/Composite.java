package com.lofxve.dp.structural.composite;

import java.util.ArrayList;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.composite
 * @ClassName: Composite
 * @Author: lofxve
 * @Description: 树枝
 * @Date: 2021/4/12 10:57
 * @Version: 1.0
 */
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
