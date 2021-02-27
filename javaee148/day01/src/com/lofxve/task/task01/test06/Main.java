package com.lofxve.task.task01.test06;

/**
 * @ClassName Main
 * @Author 魏振东
 * @Date 2020/12/12 17:12
 */
public class Main {
    public static void main(String[] args) {
        Clerk clerk =  new Clerk();
        clerk.setManager("张小强");
        clerk.setName("李小亮");
        clerk.setWorkId("002");
        clerk.setDept("销售部");
        clerk.showMsg();

        Manager Manager =  new Manager();
        clerk.setManager("李小亮");
        clerk.setWorkId("045");
        clerk.setName("张小强");
        clerk.setDept("销售部");
        clerk.showMsg();
    }
}