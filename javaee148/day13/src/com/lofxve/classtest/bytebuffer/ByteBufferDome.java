package com.lofxve.classtest.bytebuffer;

import java.nio.ByteBuffer;

/**
 * @ClassName ByteBufferDome
 * @Author lofxve
 * @Date 2020/12/30 8:59
 * @Version 1.0
 */
public class ByteBufferDome {
    public static void main(String[] args) {
        // 间接内存缓冲区===》堆内存
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(10);
        // 直接内存缓冲区==》系统内存
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(10);

        byte[] bytes = "你好".getBytes();
        ByteBuffer byteBuffer3 = ByteBuffer.wrap(bytes);
    }
}

