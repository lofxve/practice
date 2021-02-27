package com.lofxve.task.task02.test01;

/**
 * @ClassName Refrigerator
 * @Author 魏振东
 * @Date 2020/12/12 19:16
 */
public class Refrigerator {
//    门款式、制冷方式
    private String doorStyle;
    private String coolingMethod;

    public Refrigerator() {
    }

    public Refrigerator(String doorStyle, String coolingMethod) {
        this.doorStyle = doorStyle;
        this.coolingMethod = coolingMethod;
    }

    public String getDoorStyle() {
        return doorStyle;
    }

    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    public String getCoolingMethod() {
        return coolingMethod;
    }

    public void setCoolingMethod(String coolingMethod) {
        this.coolingMethod = coolingMethod;
    }
}