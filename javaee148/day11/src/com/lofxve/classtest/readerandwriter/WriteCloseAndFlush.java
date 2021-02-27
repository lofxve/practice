package com.lofxve.classtest.readerandwriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName WriteCloseAndFlush
 * @Author lofxve
 * @Date 2020/12/25 9:08
 * @Version 1.0
 */
public class WriteCloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("day11/3.txt",true);
        fileWriter.write("中");
        fileWriter.flush();
        fileWriter.write("国");
        fileWriter.close();
        fileWriter.write("人");
    }
}