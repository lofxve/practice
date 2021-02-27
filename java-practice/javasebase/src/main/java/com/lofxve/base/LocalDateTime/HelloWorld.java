package com.lofxve.base.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

    static String getTime(String flyTime ){
        int nowH = Integer.valueOf(flyTime.substring(11,13));
        int stopH = nowH;
        return (stopH<10 ? "0"+stopH : stopH) + flyTime.substring(14,16);
    }
    public static void main(String[] args) {
        //获取今日 in_come_status 不为1的航班
        int time = 2;
        String nowTime1= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


        String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(nowTime);
//        String oldTime = LocalDateTime.now().plusMinutes(time).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        System.out.println(oldTime);
//
//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime plusMinutesResult = LocalDateTime.now().plusMinutes(time);
//        LocalDateTime plusMinutesResult1 = LocalDateTime.now().minusYears(time);
//        System.out.println(plusMinutesResult1);
//
//        System.out.println(now.compareTo(plusMinutesResult)); // -1
//        System.out.println(now.compareTo(plusMinutesResult1)); // 2
    }
}
