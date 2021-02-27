package com.lofxve.base.thread.synchronizedtest.obj;

import com.lofxve.base.thread.synchronizedtest.code.impl.RunnableImpl;

public class SynchronizedPayTicketObj {
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
