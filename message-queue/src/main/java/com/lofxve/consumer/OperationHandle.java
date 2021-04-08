package com.lofxve.consumer;

import com.lofxve.enums.MessageEnums;

/**
 * 操作处理器
 *
 * @ClassName OperationHandle
 * @Author lofxve
 * @Date 2021/4/8 15:56
 * @Version 1.0
 */
public class OperationHandle extends AbstractMessageHandle {
    private MessageEnums event = MessageEnums.OPERATION;

    @Override
    public void doHandle() {
        System.out.println(event.getCode() + ":" + event.getDescription() + "处理器");
    }
}
