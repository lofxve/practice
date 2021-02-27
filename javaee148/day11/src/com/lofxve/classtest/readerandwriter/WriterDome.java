package com.lofxve.classtest.readerandwriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName WriterDome
 * @Author lofxve
 * @Date 2020/12/24 15:36
 */
public class WriterDome {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\itheima\\javaee148\\day11\\src\\com\\lofxve\\data\\lofxve.txt");
        fileWriter.write("/**\n" +
                " * @ClassName Main\n" +
                " * @Author lofxve\n" +
                " * @Date 2020/12/18 15:26\n" +
                " */\n" +
                "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "    }\n" +
                "}");
        fileWriter.flush();
        fileWriter.close();
    }
}