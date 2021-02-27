package com.lofxve.task.task02.test01;

/**
 * @ClassName HouseholdAppliances
 * @Author 魏振东
 * @Date 2020/12/12 19:12
 */
public class HouseholdAppliances {
//    品牌、型号、颜色、售价
    private String brand;
    private String type;
    private String color;
    private String sellingPrice;

    public HouseholdAppliances() {
    }

    public HouseholdAppliances(String brand, String type, String color, String sellingPrice) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.sellingPrice = sellingPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "HouseholdAppliances{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                '}';
    }
}