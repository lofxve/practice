package com.lofxve.base.Stream.Buffered;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\javase idea\\src\\Stream\\data\\a.txt");
        FileInputStream fileInputStreamTest = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStreamTest);
        byte[] bytes = new byte[200];
        int len = 0;
        if (bufferedInputStream.available()!=0) {
            while((len=bufferedInputStream.read(bytes,0,200))!=-1){
                System.out.println(new String(bytes,0,len));
            }
        }
        bufferedInputStream.close();
        fileInputStreamTest.close();
    }
}
