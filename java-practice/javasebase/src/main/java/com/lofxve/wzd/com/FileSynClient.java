package com.lofxve.wzd.com;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * author: alibobo
 * description:
 **/
public class FileSynClient {

    private AsynchronousSocketChannel client;

    // 连接服务器
    public void connect(String srcHost) {
        try {
            client = AsynchronousSocketChannel.open();
            client.setOption(StandardSocketOptions.TCP_NODELAY, true);
            Future<Void> connect = client.connect(new InetSocketAddress(srcHost, 9999));
            connect.get();
        } catch (IOException | InterruptedException | ExecutionException e) {
            System.out.println("连接服务器失败,确认服务器正常运行,以及ip设置是否正确.");
            e.printStackTrace();
        }
    }


    // 向服务器写数据数据
    private byte[] writeData(String str) throws UnsupportedEncodingException {
        // 为了得到返回的同步id, 此方法改成了成了同步等待
        Future<Integer> write = client.write(ByteBuffer.wrap(str.getBytes("UTF-8")));
        try {
            write.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("发送数据失败,请确认数据格式是否正确");
            e.printStackTrace();
        }
        // 发送成功,开始接受服务器数据
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.clear();
        Future<Integer> read = client.read(buffer);
        try {
            read.get(5, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("读取服务器响应信息有误");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("服务器响应超时");
            e.printStackTrace();
        }
        // 读取成功,返回数据
        buffer.flip();
        byte[] bytes = new byte[buffer.limit()];
        buffer.get(bytes);
        buffer.clear();
        return bytes;
    }

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
//        FileSynClient fileSynClient = new FileSynClient();
//        fileSynClient.connect("localhost");
//        fileSynClient.writeData("hhhhh");
//        fileSynClient.writeData("hhhhh");
//        fileSynClient.writeData("hhhhh");
//        fileSynClient.writeData("hhhhh");
//        fileSynClient.writeData("hhhhh");
//
        AsynchronousSocketChannel client;
        client = AsynchronousSocketChannel.open();
        client.setOption(StandardSocketOptions.TCP_NODELAY, true);
        Future<Void> connect = client.connect(new InetSocketAddress("localhost", 9999));
        connect.get();

        ByteBuffer byteBuffer = ByteBuffer.wrap("hhhhh".getBytes("UTF-8"));
        client.write(byteBuffer);
//        byteBuffer.flip();
//        byteBuffer.clear();
//
//
//        byteBuffer = ByteBuffer.wrap("hhhhh".getBytes("UTF-8"));
//        client.write(byteBuffer);
//        byteBuffer.flip();
//        byteBuffer.clear();
    }
}


