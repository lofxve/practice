package com.lofxve.message;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Message
 * @Author lofxve
 * @Date 2021/4/8 9:49
 * @Version 1.0
 */
@Data
@Builder
public class Message {
    // 消息类型 1-操作；2-事件；3-异常
    protected Integer type;
}
