package com.lofxve.enums;

import lombok.Getter;

/**
 * @ClassName MessageEnums
 * @Author lofxve
 * @Date 2021/4/8 9:52
 * @Version 1.0
 */
@Getter
public enum MessageEnums {
    OPERATION((short)1,"操作"),
    EVENT((short)2, "事件"),
    EXCEPTION((short)3, "异常"),
    ;
    private short code;
    private String description;

    MessageEnums(short code, String description) {
        this.code = code;
        this.description = description;
    }
}

