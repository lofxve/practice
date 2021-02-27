package com.lofxve.test.ticket;

/**
 * @ClassName ConcertsTicket
 * @Author 魏振东
 * @Date 2020/12/13 16:58
 */
public class ConcertsTicket extends Ticket {
    public ConcertsTicket() {
    }

    public ConcertsTicket(String title, String price, String time) {
        super(title, price, time);
    }
}