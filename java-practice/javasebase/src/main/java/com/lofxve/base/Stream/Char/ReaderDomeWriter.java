package com.lofxve.base.Stream.Char;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderDomeWriter {
    public static void outputStreamWriter(File file,String str,boolean append) {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file,append), "UTF-8")) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String InputStreamReader(File file){
        List<String> characters = new ArrayList<>();
        try(Reader Reader = new InputStreamReader(new FileInputStream(file))) {
            char[] buffer = new char[1000];
            while (Reader.read(buffer) != -1) {
                characters.add(new String(buffer));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return characters.toString();
    }
    public static void main(String[] args) {
        File file = new File("D:\\java\\javase idea\\src\\Stream\\data\\dome.txt");
        outputStreamWriter(file,"微振动给fdgsdfgsdfgsd",true);
        String s = InputStreamReader(file);
        System.out.println(s);
    }
}
