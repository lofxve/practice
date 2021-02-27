package com.lofxve.classtest.channel.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * @ClassName SocketSocketChannelDome
 * @Author lofxve
 * @Date 2020/12/30 14:53
 * @Version 1.0
 */
public class SocketSocketChannelDome {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();

        boolean bind = socketChannel.connect(new InetSocketAddress("127.0.0.1", 9527));

        if (bind){
            System.out.println("客户端连接成功..");
        }else {
            System.out.println("客户端连接失败..");
        }
    }
}