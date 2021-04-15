package com.lofxve.dp.behavioral.responsibility;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.responsibility
 * @ClassName: ConcreteHandler2
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/15 9:43
 * @Version: 1.0
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
