package com.lofxve.classtest.charatstream;

import java.io.*;

/**
 * @ClassName InputStreamReader
 * @Author lofxve
 * @Date 2020/12/25 11:45
 * @Version 1.0
 */
public class InputStreamReaderDome {

    public static void main(String[] args) throws IOException {
        readWithGBK();
//        readWithUTF8();
    }

    private static void readWithUTF8() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("day11/1.txt"),"UTF-8");
        char[] chars = new char[1024];
        int len = 0;
        while((len = inputStreamReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        inputStreamReader.close();
    }

    private static void readWithGBK() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("day11/person.txt"),"GBK");
        char[] chars = new char[1024];
        int len = 0;
        while((len = inputStreamReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        inputStreamReader.close();
    }
}