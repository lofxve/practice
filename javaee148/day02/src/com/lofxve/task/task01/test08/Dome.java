package com.lofxve.task.task01.test08;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 19:40
 */
public class Dome {
    public static void main(String[] args) {
        Company company = new Company();
        company.paySalary(new Coder("WZD", 12000.0));
        company.paySalary(new Manager("WZD", 24000.0));

    }
}