package com.lofxve.test.car;

/**
 * @ClassName CarAndSuv
 * @Author 魏振东
 * @Date 2020/12/13 16:09
 */
public abstract class CarAndSuv {
    private String pinpai;
    private String type;
    private String color;
    private String price;

    public CarAndSuv() {
    }

    public CarAndSuv(String pinpai, String type, String color, String price) {
        this.pinpai = pinpai;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "CarAndSuv{" +
                "品牌='" + pinpai + '\'' +
                ", 型号='" + type + '\'' +
                ", 颜色='" + color + '\'' +
                ", 价格='" + price + '\'' +
                '}';
    }

    public abstract void run();

}