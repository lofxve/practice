package com.lofxve.classtest.exceptiondome;

/**
 * @ClassName ThrowableDome
 * @Author lofxve
 * @Date 2020/12/20 10:37
 */
public class ThrowableDome {
    public static void main(String[] args) /*throws Exception*/ {
        try {
            //可能产生异常的代码
//            throw new Exception("异常了!");
//            throw new BaseException("BaseException....");
            throw new RuntimeException("RuntimeException");
        } catch (Exception e) {//Exception e = new Exception("异常了!");
//            异常的处理逻辑
            System.out.println(e.getMessage());//异常了!
            System.out.println(e);//java.lang.Exception: 异常了!
            e.printStackTrace();//java.lang.Exception: 异常了! at com.lofxve.classtest.exceptiondome.ThrowableDome.main(ThrowableDome.java:12)
            for (int i = 0; i < 10; i++) {
                System.out.println("HelloWorld" + i);
            }
        }
    }
}