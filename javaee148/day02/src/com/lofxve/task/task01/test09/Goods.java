package com.lofxve.task.task01.test09;

/**
 * @ClassName Goods
 * @Author 魏振东
 * @Date 2020/12/13 19:52
 */
public class Goods {
//    编号id,商品名称name,商品价格price属性
    private String id;
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}