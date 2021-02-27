package com.lofxve.task.task02.test01;

/**
 * @ClassName Motor
 * @Author 魏振东
 * @Date 2020/12/12 19:18
 */
public class Motor {
//    电机类型、洗涤容量
    private String motorType;
    private String washingCapacity;

    public Motor() {
    }

    public Motor(String motorType, String washingCapacity) {
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
}