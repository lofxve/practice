package com.lofxve.enums;

import lombok.Getter;

/**
 * 消息类型枚举
 *
 * @ClassName MessageEnums
 * @Author lofxve
 * @Date 2021/4/8 9:52
 * @Version 1.0
 */
@Getter
public enum MessageEnums {
    OPERATION(1, "操作"),
    EVENT(2, "事件"),
    EXCEPTION(3, "异常"),
    ;
    private Integer code;
    private String description;

    MessageEnums(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
}
