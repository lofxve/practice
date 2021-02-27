package com.lofxve.test.ticket;

/**
 * @ClassName RailwayTicket
 * @Author 魏振东
 * @Date 2020/12/13 16:57
 */
public class RailwayTicket extends Ticket implements Change{
    public RailwayTicket() {
    }

    public RailwayTicket(String title, String price, String time) {
        super(title, price, time);
    }

    @Override
    public void change() {
        System.out.println("火车票改签");
    }
}