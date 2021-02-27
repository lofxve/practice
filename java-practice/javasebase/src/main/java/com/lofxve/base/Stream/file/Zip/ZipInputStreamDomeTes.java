package com.lofxve.base.Stream.file.Zip;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipInputStreamDomeTes {
    public static String readAsZip(File file) throws IOException {
        String s = null;
        // 设置编码
        try(ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file), Charset.forName("GBK"))) {
            ZipEntry entry= null;
            while ((entry = zipInputStream.getNextEntry()) != null){
                String name = entry.getName();
                if (!entry.isDirectory()){
                    int n;
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((n = zipInputStream.read())!=-1){
                        stringBuilder.append((char)n);
                    }
                    s=stringBuilder.toString();
                }
            }
        }
        return s;
    }
    public static void writeAsZip(File file) throws FileNotFoundException {
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file))) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                zipOutputStream.putNextEntry(new ZipEntry(file1.getName()));
                zipOutputStream.write(file1.toString().getBytes());
                zipOutputStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\javase idea\\src\\Stream\\data\\zip.zip");
        System.out.println(readAsZip(file));
//        File file1 = new File("D:\\java\\javase idea\\src\\Stream\\data");
//        writeAsZip(file1);
    }
}
