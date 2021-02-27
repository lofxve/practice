package com.lofxve.task.task01.test08;

/**
 * @ClassName Employee
 * @Author 魏振东
 * @Date 2020/12/13 19:41
 */
public class Employee {
    private String name;
    private double pay;

    public Employee() {
    }

    public Employee(String name, double pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pay='" + pay + '\'' +
                '}';
    }
}