package com.lofxve.dp.creational.builder.product;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder.product
 * @ClassName: Product
 * @Author: lofxve
 * @Description: 产品角色：包含多个组成部件的复杂对象。
 * @Date: 2021/4/9 9:44
 * @Version: 1.0
 */
class Product {
    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }

    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA) {
        this.partA = partA;
    }
    public void setPartB(String partB) {
        this.partB = partB;
    }
    public void setPartC(String partC) {
        this.partC = partC;
    }
    public void show() {
        System.out.println(this.toString());
    }
}
