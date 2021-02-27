package com.lofxve.classtest.aio.dome02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TCPServer
 * @Author lofxve
 * @Date 2020/12/30 17:09
 * @Version 1.0
 */
public class TCPServer {
    // 异步阻塞读写
    public static void main(String[] args) throws IOException {

        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        asynchronousServerSocketChannel.bind(new InetSocketAddress(8888));
        System.out.println("accept 执行开始");
        asynchronousServerSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel result, Object attachment) {
                System.out.println("客户端请求服务器成功..");
                System.out.println("读取客户端发送的数据");
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                result.read(allocate, 10, TimeUnit.SECONDS, null, new CompletionHandler<Integer, Object>() {
                    @Override
                    public void completed(Integer result, Object attachment) {
                        System.out.println("客户端在等待时间内发送了数据.");
                        System.out.println("客户端发送的数据为：" + new String(allocate.array(), 0, result));
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {
                        System.out.println("客户端在等待时间内没有发送数据.");
                    }
                });

            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println("客户端请求服务器失败..");
            }
        });
        System.out.println("accept 执行结束");

        while (true) {
            System.out.println("休息一会");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}