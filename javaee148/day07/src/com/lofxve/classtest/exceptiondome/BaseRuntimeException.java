package com.lofxve.classtest.exceptiondome;

/**
 * @ClassName BaseRuntimeException
 * @Author lofxve
 * @Date 2020/12/20 9:53
 */
public class BaseRuntimeException extends RuntimeException{
    public BaseRuntimeException() {
        super();
    }

    public BaseRuntimeException(String message) {
        super(message);
    }
}