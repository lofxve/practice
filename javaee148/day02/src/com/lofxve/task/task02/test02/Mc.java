package com.lofxve.task.task02.test02;

/**
 * @ClassName Mc
 * @Author 魏振东
 * @Date 2020/12/13 20:17
 */
public abstract class Mc {
    private String type;
    private String price;

    public Mc() {
    }

    public Mc(String type, String price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mc{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public abstract void run();
}