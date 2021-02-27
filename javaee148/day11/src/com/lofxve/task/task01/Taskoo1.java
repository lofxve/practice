package com.lofxve.task.task01;

import com.sun.media.sound.SoftTuning;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ClassName Taskoo1
 * @Author lofxve
 * @Date 2020/12/25 14:55
 * @Version 1.0
 */
public class Taskoo1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        if (path != null) {
            File file = new File(path);
            if (file.exists()){
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.getParent());
                System.out.println(file.length());
                System.out.println(file.getName().substring(file.getName().indexOf(".")));
            }else{
                if (file.getName().contains(".")){
                    file.createNewFile();
                }else{
                    file.mkdirs();
                }
            }
        }
    }
}