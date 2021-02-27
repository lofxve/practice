package com.lofxve.classtest.test;

/**
 * @ClassName ShouJi
 * @Author 魏振东
 * @Date 2020/12/11 12:27
 */
public class DianNao extends ShangPin {
    public DianNao(String xinghao) {
        this.xinghao = xinghao;
    }

    public DianNao(String pingpai, String color, String price, String pingmu, String xinghao) {
        super(pingpai, color, price, pingmu);
        this.xinghao = xinghao;
    }

    public String getXinghao() {
        return xinghao;
    }

    public void setXinghao(String xinghao) {
        this.xinghao = xinghao;
    }

    private String xinghao;

    public void show() {
        System.out.println("品牌：" + this.getPingpai() + " 颜色：" + this.getColor() + " 价格：" + this.getPrice() + " 屏幕大小：" + this.getPingmu() + " 型号：" + this.getXinghao());
    }
}