package com.lofxve.wzd.com;

import java.io.Serializable;
import java.util.Map;

/**
 * 车辆实时状态数据
 *
 * @author liub
 */
public class VehicleState implements Serializable {

    /**
     * 终端地址码
     */
    private String HX;

    /**
     * 经度
     */
    private Double LO;

    /**
     * 纬度
     */
    private Double LA;

    /**
     * 地速
     */
    private Float SP;

    /**
     * 高度
     */
    private Double HE;

    /**
     * 方向
     */
    private Float CO;

    public String getHX() {
        return HX;
    }

    public void setHX(String HX) {
        this.HX = HX;
    }

    public Double getLO() {
        return LO;
    }

    public void setLO(Double LO) {
        this.LO = LO;
    }

    public Double getLA() {
        return LA;
    }

    public void setLA(Double LA) {
        this.LA = LA;
    }

    public Float getSP() {
        return SP;
    }

    public void setSP(Float SP) {
        this.SP = SP;
    }

    public Double getHE() {
        return HE;
    }

    public void setHE(Double HE) {
        this.HE = HE;
    }

    public Float getCO() {
        return CO;
    }

    public void setCO(Float CO) {
        this.CO = CO;
    }

    public String getTE() {
        return TE;
    }

    public void setTE(String TE) {
        this.TE = TE;
    }

    public String getRE() {
        return RE;
    }

    public void setRE(String RE) {
        this.RE = RE;
    }

    /**
     * 定位时间
     */
    private String TE;

    /**
     * 终端注册号
     */
    private String RE;

}
