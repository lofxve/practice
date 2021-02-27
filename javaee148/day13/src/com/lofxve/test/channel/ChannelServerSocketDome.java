package com.lofxve.test.channel;

import java.awt.geom.FlatteningPathIterator;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @ClassName ChannelServerSocketDome
 * @Author lofxve
 * @Date 2020/12/30 20:45
 * @Version 1.0
 */
public class ChannelServerSocketDome {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 获取serverSocketChannel 对象
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        // 绑定端口
        serverSocketChannel.bind(new InetSocketAddress(8888));

        // 设置服务端为非阻塞
        serverSocketChannel.configureBlocking(false);
        while (true){
            System.out.println("服务器已经启动,使用accpet方法监听客户端的请求...");
            // 获取socket对象
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel!=null){
                System.out.println("有客户端请求服务器，结束轮询");
                // 接受数据
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                int len = socketChannel.read(allocate);
                System.out.println("客户端向服务端发送的数据为："+new String(allocate.array(),0,len));

                // 发送数据
                socketChannel.write(ByteBuffer.wrap("好的收到,谢谢".getBytes()));

                serverSocketChannel.close();
                break;
            }
            System.out.println("没有客户端连接服务器");
            Thread.sleep(1000);
        }
    }
}