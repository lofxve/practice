package com.lofxve.test.selector;

import com.sun.media.sound.SoftTuning;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName SelectorServerDome
 * @Author lofxve
 * @Date 2020/12/30 23:01
 * @Version 1.0
 */
public class SelectorServerDome {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 获取serverSocketChannel 对象
        System.out.println("获取serverSocketChannel 对象");
        ServerSocketChannel serverSocketChannel1 = ServerSocketChannel.open();
        ServerSocketChannel serverSocketChannel2 = ServerSocketChannel.open();
        ServerSocketChannel serverSocketChannel3 = ServerSocketChannel.open();

        // 绑定端口
        System.out.println("绑定端口");
        serverSocketChannel1.bind(new InetSocketAddress(7777));
        serverSocketChannel2.bind(new InetSocketAddress(8888));
        serverSocketChannel3.bind(new InetSocketAddress(9999));

        // 非阻塞
        System.out.println("非阻塞");
        serverSocketChannel1.configureBlocking(false);
        serverSocketChannel2.configureBlocking(false);
        serverSocketChannel3.configureBlocking(false);


        // 获取多路复用器
        System.out.println("获取多路复用器");
        Selector selector = Selector.open();

        // 将socketChannel1注册到selector
        System.out.println("将socketChannel1注册到selector");
        serverSocketChannel1.register(selector, SelectionKey.OP_ACCEPT);
        serverSocketChannel2.register(selector, SelectionKey.OP_ACCEPT);
        serverSocketChannel3.register(selector, SelectionKey.OP_ACCEPT);

        // key 获取所有连接注册的socket
        Set<SelectionKey> keys = selector.keys();

        while (true) {
            int select = selector.select();
            System.out.println("当前连接的客户端数量为："+select);
            //selectionKeys
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();

                // 获取注册的ServerSocketChannel
                ServerSocketChannel serverSocketChannel = (ServerSocketChannel)selectionKey.channel();

                // 获取SocketChannel
                SocketChannel socketChannel = serverSocketChannel.accept();

                // 接受数据
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                int len = socketChannel.read(allocate);
                System.out.println("服务端向客户端发送的数据为：" + new String(allocate.array(), 0, len));

                // 发送数据
                socketChannel.write(ByteBuffer.wrap("好的收到".getBytes()));

                iterator.remove();
            }
            System.out.println("睡眠两秒，其他事情");
            Thread.sleep(1000);
        }
    }
}