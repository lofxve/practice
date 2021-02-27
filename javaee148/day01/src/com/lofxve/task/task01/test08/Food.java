package com.lofxve.task.task01.test08;

/**
 * @ClassName Food
 * @Author 魏振东
 * @Date 2020/12/12 18:28
 */
public abstract class Food {
    //    重量
    private double weight;

    public Food() {
    }

    public Food(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "weight=" + weight +
                '}';
    }

    public abstract void eat();
}