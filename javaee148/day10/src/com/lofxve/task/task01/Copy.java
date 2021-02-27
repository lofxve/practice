package com.lofxve.task.task01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName Copy
 * @Author lofxve
 * @Date 2020/12/25 15:23
 * @Version 1.0
 */
public class Copy {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        String oldpath = "D:\\k";
        File oldfile = new File(oldpath);

        String newpath = "D:\\k1";
        File newfile = new File(newpath);

        if (!oldfile.exists() || !newfile.exists()) {
            throw new IOException("文件不存在");
        }
        getAllFile(oldfile, newfile, oldfile);

    }

    private static void getAllFile(File file, File newfile, File base) {
        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File file1 : files) {
                if (file1.exists()) {
                    String newpath = file1.getAbsolutePath().replace(base.getPath(), newfile.getPath());
                    File newfile2 = new File(newpath);
                    if (file1.isFile()) {
                        if (!newfile2.exists()) {
                            System.out.println("File oldfile:" + file1.getAbsolutePath() + "====>newfile:" + newpath);
                            copyFile(new File(file1.getAbsolutePath()), newfile2);
                        } else {
                            System.out.println(file1.getName() + "已经存在");
                        }
                    } else if (file1.isDirectory()) {
                        if (!newfile2.exists()) {
                            newfile2.mkdirs();
                            System.out.println("Directory oldfile:" + file1.getAbsolutePath() + "====>newfile:" + file1.getAbsolutePath().replace(base.getPath(), newfile.getPath()));
                            getAllFile(file1, newfile, base);
                        } else {
                            System.out.println(file1.getName() + "已经存在");
                        }
                    }
                }
            }
        }
    }

    private static void copyFile(File oldfile, File newfile) {
        try (
                // 创建文件输入和输出流
                FileInputStream fileInputStream = new FileInputStream(oldfile);
                FileOutputStream fileOutputStream = new FileOutputStream(newfile);
        ) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println(newfile.getName() + " 复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}