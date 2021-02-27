package com.lofxve.classtest.timer;

import com.sun.media.sound.SoftTuning;
import sun.security.krb5.SCDynamicStoreConfig;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName TimerDome1
 * @Author lofxve
 * @Date 2020/12/22 10:21
 */
public class TimerDome1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("请输入闹钟开始时间：");
        String s = scanner.nextLine();
//        Date date = simpleDateFormat.parse(s);
        Date date = simpleDateFormat.parse("2020-12-22 10:53:22");
        System.out.println("请输入时间间隔：默认2s");
        long period = 2000;
//        int i = scanner.nextInt();
//        period = i;
        new Timer().schedule(new TimerTask(){
            @Override
            public void run() {
                System.out.println("起床了");
                System.out.println("是否关闭闹钟");
                Scanner scanner = new Scanner(System.in);
                int i = scanner.nextInt();
                if (i == 1){
                    System.exit(10);
                }
            }
        },date,period);
    }
}