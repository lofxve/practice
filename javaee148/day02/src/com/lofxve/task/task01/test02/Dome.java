package com.lofxve.task.task01.test02;

import java.util.OptionalLong;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 18:31
 */
public class Dome {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sendMessage();

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}