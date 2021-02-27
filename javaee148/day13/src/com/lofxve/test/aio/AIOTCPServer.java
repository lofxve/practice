package com.lofxve.test.aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName AIOTCPServer
 * @Author lofxve
 * @Date 2020/12/30 23:31
 * @Version 1.0
 */
public class AIOTCPServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 获取AsynchronousServerSocketChannel
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        // 绑定端口
        asynchronousServerSocketChannel.bind(new InetSocketAddress(8888));

        System.out.println("开始执行accpet");
        asynchronousServerSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel result, Object attachment) {
                System.out.println("客户端连接服务器成功..");
                // 接受数据
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                // 非阻塞
//                read(ByteBuffer[] dsts,
//                int offset,
//                int length,
//                long timeout,
//                TimeUnit unit,
//                A attachment,
//                CompletionHandler<Long,? super A> handler);
                result.read(allocate, 10, TimeUnit.SECONDS, null, new CompletionHandler<Integer, Object>() {
                    @Override
                    public void completed(Integer len, Object attachment) {
                        System.out.println("客户端发送数据成功");
                        System.out.println(new String(allocate.array(),0,len));
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {
                        System.out.println("客户端发送数据超时..");
                    }
                });


                // 发送数据
                result.write(ByteBuffer.wrap("好的收到".getBytes()));
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println("客户端连接服务器失败..");
            }
        });
        System.out.println("执行accpet结束");

        while (true){
            System.out.println("睡眠两秒，干点其他事情");
            Thread.sleep(2000);
        }

    }
}