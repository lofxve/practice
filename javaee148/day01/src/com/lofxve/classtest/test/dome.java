package com.lofxve.classtest.test;

/**
 * @ClassName dome
 * @Author 魏振东
 * @Date 2020/12/11 12:29
 */
public class dome {
    public static void main(String[] args) {
        DianNao dianNao = new DianNao("型号");
        dianNao.setPingpai("1");
        dianNao.setColor("2");
        dianNao.setPrice("3");
        dianNao.setPingmu("4");
        dianNao.setXinghao("5");
        dianNao.show();

        ShouJi shouJi = new ShouJi();
        shouJi.setPingpai("1");
        shouJi.setColor("2");
        shouJi.setPrice("3");
        shouJi.setPingmu("4");
        shouJi.show();

    }

}