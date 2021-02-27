package com.lofxve.classtest.test;

/**
 * @ClassName ShouJi
 * @Author 魏振东
 * @Date 2020/12/11 12:27
 */
public class ShouJi extends ShangPin {
    public ShouJi() {
    }

    public ShouJi(String pingpai, String color, String price, String pingmu) {
        super(pingpai, color, price, pingmu);
    }

    public void show() {
        System.out.println("品牌：" + this.getPingpai() + " 颜色：" + this.getColor() + " 价格：" + this.getPrice() + " 屏幕大小：" + this.getPingmu());
    }
}