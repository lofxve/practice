package com.lofxve.task.task02.test01;

/**
 * @ClassName Television
 * @Author 魏振东
 * @Date 2020/12/12 19:19
 */
public class Television {
//    屏幕尺寸、分辨率
    private String screenSize;
    private String resolution;

    public Television() {
    }

    public Television(String screenSize, String resolution) {
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}