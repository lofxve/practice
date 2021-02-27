package com.lofxve.test.ticket;

/**
 * @ClassName AirTicket
 * @Author 魏振东
 * @Date 2020/12/13 16:56
 */
public class AirTicket extends Ticket implements Change{

    public AirTicket() {
    }

    public AirTicket(String title, String price, String time) {
        super(title, price, time);
    }

    @Override
    public void change() {
        System.out.println("飞机票改签");
    }
}