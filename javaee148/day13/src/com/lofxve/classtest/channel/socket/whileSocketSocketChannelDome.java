package com.lofxve.classtest.channel.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @ClassName whileSocketSocketChannelDome
 * @Author lofxve
 * @Date 2020/12/30 15:17
 * @Version 1.0
 */
public class whileSocketSocketChannelDome {
    public static void main(String[] args) throws IOException, InterruptedException {

        while (true) {
            try {
                SocketChannel socketChannel = SocketChannel.open();
                // 设置客户端为非阻塞
//                socketChannel.configureBlocking(false);

                boolean bind = socketChannel.connect(new InetSocketAddress("127.0.0.1", 9527));
                System.out.println(bind);
                System.out.println("客户端连接成功..");

                System.out.println("向服务器发送数据..");
                ByteBuffer byteBuffer = ByteBuffer.wrap("你好服务器".getBytes());
                socketChannel.write(byteBuffer);

                ByteBuffer byteBufferin = ByteBuffer.allocate(1024);
                int len = socketChannel.read(byteBufferin);
                System.out.println("客户端接收到服务器发送数据： "+new String(byteBufferin.array(),0,len));
                socketChannel.close();
                break;
            } catch (IOException e) {
                System.out.println("休息2秒钟");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }

    }
}