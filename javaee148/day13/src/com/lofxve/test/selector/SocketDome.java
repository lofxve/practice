package com.lofxve.test.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @ClassName SocketDome
 * @Author lofxve
 * @Date 2020/12/30 23:15
 * @Version 1.0
 */
public class SocketDome {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try (
                            SocketChannel socketChannel = SocketChannel.open()
                    ) {
                        boolean connect = socketChannel.connect(new InetSocketAddress("127.0.0.1", 7777));
                        System.out.println(connect);
                        if (connect) {
                            System.out.println("客户端连接服务器成功");
                            System.out.println("开始向服务器发送数据...");

                            // 发送数据
                            socketChannel.write(ByteBuffer.wrap("我是连接服务器7777端口号的客户端对象".getBytes()));

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
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
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
                            socketChannel.write(ByteBuffer.wrap("我是连接服务器8888端口号的客户端对象".getBytes()));

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
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try (
                            SocketChannel socketChannel = SocketChannel.open()
                    ) {
                        boolean connect = socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999));
                        System.out.println(connect);
                        if (connect) {
                            System.out.println("客户端连接服务器成功");
                            System.out.println("开始向服务器发送数据...");

                            // 发送数据
                            socketChannel.write(ByteBuffer.wrap("我是连接服务器9999端口号的客户端对象".getBytes()));
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
        }).start();
    }
}