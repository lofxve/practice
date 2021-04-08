package com.lofxve.factory;

import com.lofxve.consumer.AbstractMessageHandle;
import com.lofxve.consumer.EventHandle;
import com.lofxve.consumer.ExceptionHandle;
import com.lofxve.consumer.OperationHandle;
import com.lofxve.enums.MessageEnums;

/**
 * 消息工厂，生产消息处理器
 *
 * @ClassName MessageFactory
 * @Author lofxve
 * @Date 2021/4/8 16:04
 * @Version 1.0
 */
public class MessageFactory {
    /**
     * @return com.lofxve.consumer.AbstractMessageHandle
     * @Author lofxve
     * @Description // 根据code获取指定的消息处理器
     * @Date 16:46 2021/4/8
     * @Param [code]
     **/
    public static AbstractMessageHandle getHandle(Integer code) {
        if (code == null) {
            return null;
        } else if (MessageEnums.EVENT.getCode().equals(code)) {
            return new EventHandle();
        } else if (MessageEnums.EXCEPTION.getCode().equals(code)) {
            return new ExceptionHandle();
        } else if (MessageEnums.OPERATION.getCode().equals(code)) {
            return new OperationHandle();
        }
        return null;
    }
}
