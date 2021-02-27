package com.lofxve.classtest.readerandwriter;

import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName ReaderDome
 * @Author lofxve
 * @Date 2020/12/24 12:07
 */
public class ReaderDome {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\itheima\\javaee148\\day11\\src\\com\\lofxve\\data\\lofxve.txt");

        char[] bytes = new char[1024];
        int len = 0;
        while ((len = fileReader.read())!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fileReader.close();
    }
}