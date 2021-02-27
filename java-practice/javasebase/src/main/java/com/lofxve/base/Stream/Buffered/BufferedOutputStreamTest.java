package com.lofxve.base.Stream.Buffered;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\javase idea\\src\\Stream\\data\\a.txt");
        String  str = "qqqqqqqqq  wwww   sssssss";
        // 首先要将字符串转化为字节
        byte[] byteData = str.getBytes();
        //可以直接写入，但是会从都开始写入，覆盖掉文件中开头的字符串
        // 如果是在文件中进行追加，必须在构造流的时候，将后面的参数设置为true
        FileOutputStream out = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
        bufferedOutputStream.write(byteData);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
