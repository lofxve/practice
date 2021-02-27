package com.lofxve.classtest.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName TCPServer
 * @Author lofxve
 * @Date 2020/12/30 16:02
 * @Version 1.0
 */
public class TCPServer {
    public static void main(String[] args) throws IOException, InterruptedException {
       // 创建三个 ServerSocketChannel 非阻塞
        ServerSocketChannel ssc1 = ServerSocketChannel.open();
        ssc1.bind(new InetSocketAddress(9527));
        ssc1.configureBlocking(false);
        ServerSocketChannel ssc2 = ServerSocketChannel.open();
        ssc2.bind(new InetSocketAddress(9526));
        ssc2.configureBlocking(false);
        ServerSocketChannel ssc3 = ServerSocketChannel.open();
        ssc3.bind(new InetSocketAddress(9528));
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
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();

            while (iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();
                // 去除服务器
                ServerSocketChannel serverSocketChannel = (ServerSocketChannel)selectionKey.channel();
                // 取出serverSocketChannel所监听的端口的事件
                SocketChannel accept = serverSocketChannel.accept();
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                int len = accept.read(allocate);
                System.out.println("客户端向服务器发送的数据为："+ new String(allocate.array(),0,len));

                // 移除iterator.next()取出的selectionKey对象
                iterator.remove();
            }

            System.out.println("睡眠2秒钟(干点其他事情),再次轮询获取客户端的请求...");
            Thread.sleep(2000);
        }



    }
}