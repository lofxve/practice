package com.lofxve.task.task01.test04;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 18:52
 */
public class Dome {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.playgame();
        computer.shutdown();
        Phone phone = new Phone();
        phone.start();
        phone.playgame();
        phone.shutdown();
    }
}