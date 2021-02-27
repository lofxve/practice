package com.lofxve.test.bytebuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @ClassName ByteBufferDome
 * @Author lofxve
 * @Date 2020/12/30 19:48
 * @Version 1.0
 */
public class ByteBufferDome {
    public static void main(String[] args) {
        // 堆内存
        ByteBuffer allocate = ByteBuffer.allocate(10);

        // 系统内存
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10);

        // byte数组构建
        ByteBuffer wrap = ByteBuffer.wrap("你好".getBytes());

        // put
        allocate.put((byte) 10);
        System.out.println(Arrays.toString(allocate.array()));

        // put(byte[] src) 不能越界
        System.out.println(Arrays.toString("北京".getBytes()));
        wrap.put("北京".getBytes());
        System.out.println(Arrays.toString(wrap.array()));

        //  put(byte[] src, int offset, int length)
        allocate.put("北京".getBytes(), 0, 3);
        System.out.println(Arrays.toString(allocate.array()));

        // put(int index, byte b)
        allocate.put(4, (byte) -28);
        allocate.put(5, (byte) -70);
        allocate.put(6, (byte) -84);
        System.out.println(Arrays.toString(allocate.array()));

        // capacity 容量 Buffer所能够包含的元素的最大数量。定义了Buffer后，容量是不可变的。
        System.out.println("capacity==>容量 " + allocate.capacity());

        // limit 限制 那么此位置后的位置将不可用 0-capacity
        allocate.limit(9);
        System.out.println("limit==>限制 " + allocate.limit());

        //position 索引 当前可写入的索引。位置不能小于0，并且不能大于"限制"。 0-limit
        System.out.println("position==>索引 " + allocate.position());

        // mark标记 reset 获取当前position的值并记录下来，更新position的值，reset将position的值重置为更新前mark记录的值
        System.out.println(byteBuffer.mark());
        byteBuffer.put((byte)10);
        System.out.println(byteBuffer.position());
        byteBuffer.reset();
        System.out.println(byteBuffer.position());

        // remaining = position-limit
        System.out.println(byteBuffer.remaining());
        // isReadOnly 是否只读
        System.out.println(byteBuffer.isReadOnly());
        // isDirect 是否是系统内存 还是堆内存
        System.out.println(byteBuffer.isDirect());

        // clear
        //- 将position设置为：0
        //- 将限制limit设置为容量capacity；
        //- 丢弃标记mark。
        byteBuffer.limit(5);
        System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
        byteBuffer.clear();
        System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());

        //flip
        //- 将limit设置为当前position位置； [0, 1, 2, 0, 0, 0, 0, 0, 0, 0]  position=3 limit=10
        //- 将当前position位置设置为0；   position=0 limit=3  new String(bytes,0,len)
        //- 丢弃标记。
        System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
        byteBuffer.flip();
        System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
    }
}