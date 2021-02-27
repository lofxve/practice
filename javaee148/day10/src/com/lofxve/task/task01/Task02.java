package com.lofxve.task.task01;

import java.io.File;
import java.util.Scanner;

/**
 * @ClassName Task02
 * @Author lofxve
 * @Date 2020/12/25 15:12
 * @Version 1.0
 */
public class Task02 {
    public static int sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        if (path != null) {
            File file = new File(path);
            getAllFile(file);
            System.out.println(sum);
        }
    }

    private static void getAllFile(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File file1 : files) {
                if (file1.exists()) {
                    if (file1.isFile()) {
                        sum += file1.length();
                    }else if (file1.isDirectory()){
                        getAllFile(file1);
                    }
                }
            }
        }
    }
}