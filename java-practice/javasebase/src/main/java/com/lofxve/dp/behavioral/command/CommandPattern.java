package com.lofxve.dp.behavioral.command;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.command
 * @ClassName: CommandPattern
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/12 10:00
 * @Version: 1.0
 */
public class CommandPattern {
    public static void main(String[] args) {
        // 菜单包子,创建包子的时候就已经制定了制作包子的厨师
        Command cmd = new ConcreteCommand();
        // 服务员获取菜单
        Invoker ir = new Invoker(cmd);
        // 交给厨师去做
        ir.call();

        System.out.println();

        Command cmd1 = new ConcreteCommand1();
        Invoker ir1 = new Invoker(cmd1);
        ir1.call();
    }
}
