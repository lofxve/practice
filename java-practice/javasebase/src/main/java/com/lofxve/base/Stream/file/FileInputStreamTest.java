package com.lofxve.base.Stream.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\javase idea\\src\\Stream\\data\\a.txt");
        InputStream in = new FileInputStream(file);
        byte[] byteData = new byte[200];
        // 从in 这个流中读取数据，每次最多读取200个字节，赋给byteData,
        // 返回值是一次实际读取的字节个数赋给length
        // 第二次条件判断 length = -1 , 结束读取操作
        int length = 0;
       if (in.available()!=0){
           System.out.println("==========>"+in.available());
           // 跳过字节
           in.skip(100);
           while (-1 != (length = in.read(byteData, 0 , 200)) ){
               System.out.println("==========>"+in.available());
               // 将字节数组转化为字符串, 第一个参数为字节数组， 第二个参数是转化的起始位置， 第三个参数为转化的长度
               String str = new String(byteData, 0, length);
               System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
               System.out.println(str);
           }
       }
        in.close(); // 关闭流，一定要关闭
    }
}