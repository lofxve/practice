package com.lofxve.dp.behavioral.command;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.command
 * @ClassName: ConcreteCommand
 * @Author: lofxve
 * @Description: 具体命令 豆浆
 * @Date: 2021/4/12 9:58
 * @Version: 1.0
 */
class ConcreteCommand1 implements Command {
    private Receiver1 receiver;

    ConcreteCommand1() {
        receiver = new Receiver1();
    }

    @Override
    public void execute() {
        System.out.println("具体命令豆浆");
        receiver.action();
    }
}
