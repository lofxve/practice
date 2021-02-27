package com.lofxve.classtest.ticketdome;

import com.lofxve.classtest.ticketdome.impl.TicketRunnable;

/**
 * @ClassName Main
 * @Author lofxve
 * @Date 2020/12/21 14:46
 */
public class Main {
    public static int ticket = 100;

    public static void main(String[] args) {
        TicketRunnable ticketRunnable = new TicketRunnable();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
        new Thread(ticketRunnable).start();
    }
}