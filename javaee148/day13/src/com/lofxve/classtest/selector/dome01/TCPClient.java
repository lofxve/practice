package com.lofxve.classtest.selector.dome01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @ClassName TCPClient
 * @Author lofxve
 * @Date 2020/12/30 16:24
 * @Version 1.0
 */
public class TCPClient {
    public static void main(String[] args) {
        new Thread(()->{ {
                while (true){
                    try {
                        SocketChannel socketChannel = SocketChannel.open();
                        socketChannel.connect(new InetSocketAddress("127.0.0.1",9527));
                        System.out.println("连接端口号为9527的服务器成功！给服务器发送数据");

                        socketChannel.write(ByteBuffer.wrap("你好客户端我是9527".getBytes()));

                        socketChannel.close();
                    } catch (IOException e) {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                    }
                    break;
                }
            }
        }).start();
        new Thread(()->{ {
            while (true){
                try {
                    SocketChannel socketChannel = SocketChannel.open();
                    socketChannel.connect(new InetSocketAddress("127.0.0.1",9526));
                    System.out.println("连接端口号为9526的服务器成功！");

                    socketChannel.write(ByteBuffer.wrap("你好客户端我是9527".getBytes()));

                    socketChannel.close();
                } catch (IOException e) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                break;
            }
        }
        }).start();
        new Thread(()->{ {
            while (true){
                try {
                    SocketChannel socketChannel = SocketChannel.open();
                    socketChannel.connect(new InetSocketAddress("127.0.0.1",9528));
                    System.out.println("连接端口号为9528服务器成功！");

                    socketChannel.write(ByteBuffer.wrap("你好客户端我是9527".getBytes()));

                    socketChannel.close();
                } catch (IOException e) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                break;
            }
        }
        }).start();
    }
}