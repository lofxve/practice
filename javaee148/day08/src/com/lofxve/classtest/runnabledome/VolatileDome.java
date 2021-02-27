package com.lofxve.classtest.runnabledome;

import com.lofxve.classtest.runnabledome.impl.MyRunnable01;
import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;

/**
 * @ClassName Dome
 * @Author lofxve
 * @Date 2020/12/18 16:18
 */
public class VolatileDome {
    public static void main(String[] args) {
        /**
         * 不可见性
         * 使用 volatile 关键字解决，不能解决原子性问题,可以解决有序性
         **/
        new Thread(new MyRunnable01()).start();
        while (true){
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            if (MyRunnable01.k==1){
                break;
            }
        }
    }
}