package com.lofxve.classtest.exceptiondome;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName ExceptionDome
 * @Author lofxve
 * @Date 2020/12/20 8:52
 */
public class ExceptionDome {
    public static void main(String[] args) {
//        showException();
        runntimeExecption();
    }

    private static void runntimeExecption() {
        int[] i = {1,2,3};
        try {
            System.out.println(i[3]);
        } catch (Exception e) {
        } finally {
            System.out.println("后续代码！");
        }
    }

    private static void showException() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = simpleDateFormat.parse("2020-12-15 12:12:12");
            System.out.println(parse);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("后续代码！");
        }
    }
}
