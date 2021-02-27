package com.lofxve.task.task01.test08;

/**
 * @ClassName Fish
 * @Author 魏振东
 * @Date 2020/12/12 18:35
 */
public abstract class Fish extends Food{
    private String type;
    private String price;

    public Fish() {
    }

    public Fish(String type, String price) {
        this.type = type;
        this.price = price;
    }

    public Fish(double weight, String type, String price) {
        super(weight);
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}