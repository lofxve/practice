package com.lofxve.task.task01.test08;

import javax.sound.midi.Soundbank;

/**
 * @ClassName Company
 * @Author 魏振东
 * @Date 2020/12/13 19:44
 */
public class Company implements Money{
    private double money = 1000000.0;
    @Override
    public void paySalary(Employee employee) {
        money -=employee.getPay();
        System.out.println("给"+employee.getName()+"发工资"+employee.getPay()+"元，公司剩余："+money+"元");
    }
}