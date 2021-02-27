package com.lofxve.classtest.runnabledome;

import com.lofxve.classtest.runnabledome.impl.TicketRunnable;

/**
 * @ClassName TicketDome
 * @Author lofxve
 * @Date 2020/12/18 18:10
 */
public class TicketDome {
    public static void main(String[] args) {
        TicketRunnable ticketRunnable = new TicketRunnable();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
    }
}