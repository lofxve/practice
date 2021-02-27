package com.lofxve.test.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.TreeMap;

/**
 * @ClassName ChannelSocketDome
 * @Author lofxve
 * @Date 2020/12/30 20:46
 * @Version 1.0
 */
public class ChannelSocketDome {
    public static void main(String[] args) throws IOException {
        while (true) {
            try (
                    SocketChannel socketChannel = SocketChannel.open()
            ) {
                boolean connect = socketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
                System.out.println(connect);
                if (connect) {
                    System.out.println("客户端连接服务器成功");
                    System.out.println("开始向服务器发送数据...");

                    // 发送数据
                    socketChannel.write(ByteBuffer.wrap("你好服务器".getBytes()));

                    // 接受数据
                    ByteBuffer allocate = ByteBuffer.allocate(1024);
                    int len = socketChannel.read(allocate);
                    System.out.println("服务端向客户端发送的数据为：" + new String(allocate.array(), 0, len));
                    break;
                }
            } catch (IOException e) {
                try {
                    System.out.println("连接失败，睡眠两秒钟");
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }
    }
}