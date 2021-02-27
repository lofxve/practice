package com.lofxve.test.aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @ClassName AIOTCPClinet
 * @Author lofxve
 * @Date 2020/12/30 23:38
 * @Version 1.0
 */
public class AIOTCPClinet {
    public static void main(String[] args) throws IOException, InterruptedException {
        AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open();

        Future<Void> future = asynchronousSocketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
        // 让程序睡眠5秒钟,等待客户端连接服务器
        Thread.sleep(5000);
        while (true){
            if (future.isDone()) {
                System.out.println("连接成功");
                asynchronousSocketChannel.write(ByteBuffer.wrap("你好服务器".getBytes()));

                // 接受数据
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                Future<Integer> len = asynchronousSocketChannel.read(allocate);
                try {
                    Integer integer = len.get();
                    System.out.println("服务端向客户端发送的数据为：" + new String(allocate.array(), 0, integer));
                    break;
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("让程序睡眠5秒钟,等待客户端连接服务器");
                Thread.sleep(100);
            }
        }
    }
}