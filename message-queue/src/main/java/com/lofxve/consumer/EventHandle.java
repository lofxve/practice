package com.lofxve.consumer;

import com.lofxve.enums.MessageEnums;

/**
 * 事件处理器
 *
 * @ClassName EventHandle
 * @Author lofxve
 * @Date 2021/4/8 15:56
 * @Version 1.0
 */
public class EventHandle extends AbstractMessageHandle {
    MessageEnums event = MessageEnums.EVENT;

    @Override
    public void doHandle() {
        System.out.println(event.getCode() + ":" + event.getDescription() + "处理器");
    }
}
