package com.lofxve.base.thread.synchronizedtest.old;

import com.lofxve.base.thread.synchronizedtest.old.impl.RunnableImpl;

public class PayTicket {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
