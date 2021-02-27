package com.lofxve.classtest.file;

import java.io.File;

/**
 * @ClassName FileFunDome
 * @Author lofxve
 * @Date 2020/12/22 15:49
 */
public class FileFunDome {
    public static void main(String[] args) {
        File file = new File("day10");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length>0) {
            for (File file1 : files) {
                if (file1.isDirectory()){
                    getAllFile(file1);
                }else if (file1.isFile()){
                    System.out.println(file1.toString().replace(file.toString()+"\\",""));
                }
            }
        }
    }
}