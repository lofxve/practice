package com.lofxve.classtest.channel.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @ClassName WhileServerSocketChannelDome
 * @Author lofxve
 * @Date 2020/12/30 15:12
 * @Version 1.0
 */
public class WhileServerSocketChannelDome {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 获取服务器的ServerSocketChannel对象
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定端口号
        serverSocketChannel.bind(new InetSocketAddress(9527));

        while (true){
            // configureBlocking设置服务器为非阻塞(不等待客户端连接直接执行)
            serverSocketChannel.configureBlocking(false);

            System.out.println("等待客户端连接...");
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel != null) {
                System.out.println("有客户端连接..结束轮询");

                ByteBuffer byteBufferin = ByteBuffer.allocate(1024);
                int len = socketChannel.read(byteBufferin);
                System.out.println("服务器接收到客户端发送数据： "+new String(byteBufferin.array(),0,len));

                System.out.println("向客户端发送数据..");
                ByteBuffer byteBufferout = ByteBuffer.wrap("好的收到".getBytes());
                socketChannel.write(byteBufferout);
                // 结束轮询
                socketChannel.close();
                break;
            }
            System.out.println("睡眠两秒，可以做点其他事情");
            Thread.sleep(2000);
        }

    }
}