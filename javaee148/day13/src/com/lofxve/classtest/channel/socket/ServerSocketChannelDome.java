package com.lofxve.classtest.channel.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @ClassName ServerSocketChannelDome
 * @Author lofxve
 * @Date 2020/12/30 14:52
 * @Version 1.0
 */
public class ServerSocketChannelDome {
    public static void main(String[] args) throws IOException {
        // 获取服务器的ServerSocketChannel对象
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定端口号
        serverSocketChannel.bind(new InetSocketAddress(9527));

        // configureBlocking设置服务器为非阻塞(不等待客户端连接直接执行)
        serverSocketChannel.configureBlocking(false);

        System.out.println("等待客户端连接...");
        SocketChannel accept = serverSocketChannel.accept();
        System.out.println("有客户端连接..");
    }
}