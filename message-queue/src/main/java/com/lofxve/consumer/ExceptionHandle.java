package com.lofxve.consumer;

import com.lofxve.enums.MessageEnums;

/**
 * 异常处理器
 *
 * @ClassName ExceptionHandle
 * @Author lofxve
 * @Date 2021/4/8 15:57
 * @Version 1.0
 */
public class ExceptionHandle extends AbstractMessageHandle {
    private MessageEnums event = MessageEnums.EXCEPTION;

    @Override
    public void doHandle() {
        System.out.println(this.deviceType + ":" + event.getCode() + ":" + event.getDescription() + "处理器");
    }
}
