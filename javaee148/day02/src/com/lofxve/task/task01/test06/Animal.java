package com.lofxve.task.task01.test06;

/**
 * @ClassName Animal
 * @Author 魏振东
 * @Date 2020/12/13 19:28
 */
public abstract class Animal {
    private String name;
    private String weight;

    public Animal() {
    }

    public Animal(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public abstract void eat();
}