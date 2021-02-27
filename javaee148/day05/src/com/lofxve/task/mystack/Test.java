package com.lofxve.task.mystack;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ClassName Test
 * @Author com.lofxve
 * @Date 2020/12/17 19:44
 */
public class Test {
    public static void main(String[] args) {
        Mycontainer<String> stringMycontainer = new Mycontainer<>();
        stringMycontainer.add("objectsobjects");
        stringMycontainer.add("objectsobjects");
        stringMycontainer.add("objectsobjects");
        stringMycontainer.add("objectsobjects");
        stringMycontainer.add("objectsobjects");
        stringMycontainer.add("objectsobjects");
        stringMycontainer.add("objectsobjects");
        System.out.println(stringMycontainer);
        System.out.println(stringMycontainer.get(2));
        System.out.println(stringMycontainer.size());
    }
}