package com.lofxve.task.task01.test04;

/**
 * @ClassName Rectangle
 * @Author 魏振东
 * @Date 2020/12/12 16:32
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * (this.getHeight() + this.getWidth());
    }

    @Override
    public double area() {
        return this.getHeight() * this.getWidth();
    }
}

