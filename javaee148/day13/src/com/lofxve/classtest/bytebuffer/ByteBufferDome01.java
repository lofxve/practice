package com.lofxve.classtest.bytebuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @ClassName ByteBufferDome01
 * @Author lofxve
 * @Date 2020/12/30 9:09
 * @Version 1.0
 */
public class ByteBufferDome01 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(100);

        byte[] bytes = buffer.array();
        System.out.println(Arrays.toString(bytes));

        // put
        buffer.put((byte)10);
        System.out.println(Arrays.toString(buffer.array()));

        // put(byte[] src)
        byte[] bytes1 = "北京欢迎你".getBytes();
        buffer.put(bytes1);
        System.out.println(Arrays.toString(bytes1));
        System.out.println(Arrays.toString(buffer.array()));

        // put(byte[] src, int offset, int length)
        buffer.put(bytes1,0,4);
        System.out.println(Arrays.toString(buffer.array()));


    }
}