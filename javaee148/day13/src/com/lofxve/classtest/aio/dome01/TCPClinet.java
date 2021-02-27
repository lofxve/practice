package com.lofxve.classtest.aio.dome01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.Future;

/**
 * @ClassName TCPClinet
 * @Author lofxve
 * @Date 2020/12/30 17:09
 * @Version 1.0
 */
public class TCPClinet {
    public static void main(String[] args) throws IOException {
        AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open();

        while (true) {
            Future<Void> future = asynchronousSocketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
            System.out.println(future.isDone());
            if (future.isDone()) {
                asynchronousSocketChannel.write(ByteBuffer.wrap("你好服务器".getBytes()));
                asynchronousSocketChannel.close();
            } else {
                try {
                    System.out.println("睡眠5秒钟");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}