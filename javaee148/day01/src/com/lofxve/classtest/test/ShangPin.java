package com.lofxve.classtest.test;

/**
 * @ClassName ShangPin
 * @Author 魏振东
 * @Date 2020/12/11 12:19
 */
public class ShangPin {
    public ShangPin() {
    }

    public String getPingpai() {
        return pingpai;
    }

    public void setPingpai(String pingpai) {
        this.pingpai = pingpai;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPingmu() {
        return pingmu;
    }

    public void setPingmu(String pingmu) {
        this.pingmu = pingmu;
    }

    public ShangPin(String pingpai, String color, String price, String pingmu) {
        this.pingpai = pingpai;
        this.color = color;
        this.price = price;
        this.pingmu = pingmu;
    }

    @Override
    public String toString() {
        return "ShangPin{" +
                "pingpai='" + pingpai + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", pingmu='" + pingmu + '\'' +
                '}';
    }

    private String pingpai;
    private String color;
    private String price;
    private String pingmu;
}