package com.lofxve.task.task02.test04;

/**
 * @ClassName Person
 * @Author 魏振东
 * @Date 2020/12/12 19:52
 */
public abstract class Person {
    //    工号、姓名、年龄
    private String id;
    private String name;
    private int age;

    //    public void  notice(String str){
//        System.out.println("通知：");
//        System.out.println(str);
//        System.out.println("\t必胜环球科技有限公司");
//    }
    public void notice(String content) {
        System.out.println("通知：");
        setContent(content);
        System.out.println("\t必胜环球科技有限公司");
    }

    public abstract void setContent(String content);

}