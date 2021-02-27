package com.lofxve.classtest.selector.dome01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * @ClassName TCPServer
 * @Author lofxve
 * @Date 2020/12/30 16:02
 * @Version 1.0
 */
public class TCPServer {
    public static void main(String[] args) throws IOException, InterruptedException {
       // 创建三个 ServerSocketChannel 非阻塞
        ServerSocketChannel ssc1 = ServerSocketChannel.open().bind(new InetSocketAddress(9527));
        ssc1.configureBlocking(false);
        ServerSocketChannel ssc2 = ServerSocketChannel.open().bind(new InetSocketAddress(9526));
        ssc2.configureBlocking(false);
        ServerSocketChannel ssc3 = ServerSocketChannel.open().bind(new InetSocketAddress(9528));
        ssc3.configureBlocking(false);

        // 创建selector对象
        Selector selector = Selector.open();

        // 将ServerSocketChannel注册到selector
        ssc1.register(selector, SelectionKey.OP_ACCEPT);
        ssc2.register(selector, SelectionKey.OP_ACCEPT);
        ssc3.register(selector, SelectionKey.OP_ACCEPT);

        // keys 所有的selectionkey
        System.out.println(selector.keys());

        // keys 返回已经连接的selectedKeys
        System.out.println(selector.selectedKeys());

        // select() 后去连接服务器的客户端数量，没有客户端连接，将阻塞（一直等待）
        System.out.println("连接服务器的客户端数量"+selector.select());

        while (true){
            int select = selector.select();
            System.out.println(select);
            System.out.println(selector.selectedKeys());
            System.out.println("睡眠2秒钟(干点其他事情),再次轮询获取客户端的请求...");
            Thread.sleep(2000);
        }



    }
}