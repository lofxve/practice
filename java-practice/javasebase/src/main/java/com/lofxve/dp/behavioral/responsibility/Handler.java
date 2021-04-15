package com.lofxve.dp.behavioral.responsibility;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.behavioral.responsibility
 * @ClassName: Handler
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/15 9:35
 * @Version: 1.0
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    // 处理请求的方法
    public abstract void handleRequest(String request);
}
