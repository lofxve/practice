package com.lofxve.task.task02.test01;

/**
 * @ClassName Phone
 * @Author 魏振东
 * @Date 2020/12/14 16:42
 */
public class Phone {
    private String type;
    private String color;
    private String price;

    public Phone() {
    }

    public Phone(String type, String color, String price) {
        this.type = type;
        this.color = color;
        this.price = price;
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
        return "Phone{" +
                "品牌='" + type + '\'' +
                ", 颜色='" + color + '\'' +
                ", 价格='" + price + '\'' +
                '}';
    }
}