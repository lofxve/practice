package com.lofxve.base.thread.synchronizedtest.code;

import com.lofxve.base.thread.synchronizedtest.code.impl.RunnableImpl;

public class SynchronizedPayTicket {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
