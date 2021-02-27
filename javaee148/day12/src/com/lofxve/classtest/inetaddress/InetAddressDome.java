package com.lofxve.classtest.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDome {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("activate.navicat.com");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());

        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getLoopbackAddress());
    }
}
