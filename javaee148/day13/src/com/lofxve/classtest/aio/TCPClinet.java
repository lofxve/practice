package com.lofxve.classtest.aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousSocketChannel;

/**
 * @ClassName TCPClinet
 * @Author lofxve
 * @Date 2020/12/30 17:09
 * @Version 1.0
 */
public class TCPClinet {
    public static void main(String[] args) throws IOException {
        AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open();

        asynchronousSocketChannel.connect(new InetSocketAddress("127.0.0.1",8888));

    }
}