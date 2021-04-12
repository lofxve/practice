package com.lofxve.dp.behavioral.command;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.command
 * @ClassName: ConcreteCommand
 * @Author: lofxve
 * @Description: 具体命令 包子
 * @Date: 2021/4/12 9:58
 * @Version: 1.0
 */
class ConcreteCommand implements Command {
    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        System.out.println("具体命令包子");
        receiver.action();
    }
}
