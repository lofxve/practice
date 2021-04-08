package com.lofxve.consumer;

import com.lofxve.message.Message;

/**
 * 消息处理器抽象类
 *
 * @ClassName AbstractMessageHandle
 * @Author lofxve
 * @Date 2021/4/8 15:53
 * @Version 1.0
 */
public abstract class AbstractMessageHandle implements Runnable {
    protected Integer deviceType;

    public void setMessageField(Message message) {
        this.deviceType = message.getType();
    }

    @Override
    public void run() {
        doHandle();
    }

    public abstract void doHandle();
}
