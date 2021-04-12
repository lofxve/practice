package com.lofxve.dp.behavioral.command;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.command
 * @ClassName: Invoker
 * @Author: lofxve
 * @Description: 调用者 服务员
 * @Date: 2021/4/12 9:57
 * @Version: 1.0
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
