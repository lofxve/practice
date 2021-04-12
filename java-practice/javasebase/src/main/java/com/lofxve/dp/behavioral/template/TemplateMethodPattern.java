package com.lofxve.dp.behavioral.template;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.template
 * @ClassName: TemplateMethodPattern
 * @Author: lofxve
 * @Description: 模板方法
 * @Date: 2021/4/12 11:18
 * @Version: 1.0
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        // 去美国留学流程图
        AbstractClass tm = new ConcreteClass();
        // 走流程
        tm.templateMethod();
    }
}
