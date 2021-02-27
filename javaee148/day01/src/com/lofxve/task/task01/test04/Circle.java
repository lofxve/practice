package com.lofxve.task.task01.test04;

/**
 * @ClassName Circle
 * @Author 魏振东
 * @Date 2020/12/12 16:28
 */
public class Circle extends Shape {
    private double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}