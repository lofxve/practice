package com.lofxve.base.Stream.file;

import java.io.File;
import java.io.IOException;

public class FileTestDome {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\javase idea\\src\\Stream\\data\\a.txt");
        System.out.println(file);
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println("是否是一个已经存在的文件："+file.isFile());
        System.out.println("是否是一个已经存在的目录："+file.isDirectory());
        System.out.println("文件是否可读："+file.canRead());
        System.out.println("文件是否可写："+file.canWrite());
        System.out.println("文件是否可以执行："+file.canExecute());
        System.out.println("文件的字节大小："+file.length());

        // 文件的创建和删除
        File file1 = new File("D:\\java\\javase idea\\src\\Stream\\data\\b.txt");
        if (file1.createNewFile()){
            System.out.println(file1.isFile());
            if (file1.isFile()){
                file1.delete();
            }
        }

        // 文件目录的遍历
        File file2 = new File("D:\\java\\javase idea\\src\\Stream");
        File[] files = file2.listFiles();
        for (File file3 : files) {
            System.out.println(file3);
            if (file3.isDirectory()){
                File[] files1 = file3.listFiles();
                for (File file4 : files1) {
                    System.out.println(file4);
                }
            }
        }


    }
}
