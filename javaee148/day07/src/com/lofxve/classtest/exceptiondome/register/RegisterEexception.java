package com.lofxve.classtest.exceptiondome.register;

/**
 * @ClassName RegisterEexception
 * @Author lofxve
 * @Date 2020/12/20 14:36
 */
public class RegisterEexception extends RuntimeException{
    public RegisterEexception() {
    }

    public RegisterEexception(String message) {
        super(message);
    }
}