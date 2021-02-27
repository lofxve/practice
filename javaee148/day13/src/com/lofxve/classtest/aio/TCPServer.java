package com.lofxve.classtest.aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * @ClassName TCPServer
 * @Author lofxve
 * @Date 2020/12/30 17:09
 * @Version 1.0
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {

        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        asynchronousServerSocketChannel.bind(new InetSocketAddress(8888));
        System.out.println("accept 执行开始");
        asynchronousServerSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel,Object>() {
            @Override
            public void completed(AsynchronousSocketChannel result, Object attachment) {
                System.out.println("客户端请求服务器成功..");
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println("客户端请求服务器失败..");
            }
        });
        System.out.println("accept 执行结束");

        while(true){
            System.out.println("休息一会");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}