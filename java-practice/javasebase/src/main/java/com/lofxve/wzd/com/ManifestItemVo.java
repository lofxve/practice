package com.lofxve.wzd.com;

/**
 *  舱单打印详情
 * @ClassName: ManifestVo
 * @Auther: weizhendong
 * @Date: 16:31 2020/10/27
 **/
public class ManifestItemVo {
    /**
     *  运单id
     **/
    private Long orderId;

    /**
     *  货运单号
     **/
    private String orderNo;

    /**
     *  件数
     **/
    private Integer number;


    /**
     *  重量
     **/
    private Double weight;

    /**
     *  始发地三字码IATA
     **/
    private String orap;

    /**
     *  目的地三字码IATA
     **/
    private String deap;

    /**
     *  货品名称
     **/
    private String name;

    private Integer priorityState;

    /**
     * 中转站
     **/
    private String transferStation;
    /**
     * 分批
     **/
    private Integer batchStatus;
    /**
     *  舱位id
     **/

    private Long cabinId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getOrap() {
        return orap;
    }

    public void setOrap(String orap) {
        this.orap = orap;
    }

    public String getDeap() {
        return deap;
    }

    public void setDeap(String deap) {
        this.deap = deap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriorityState() {
        return priorityState;
    }

    public void setPriorityState(Integer priorityState) {
        this.priorityState = priorityState;
    }

    public String getTransferStation() {
        return transferStation;
    }

    public void setTransferStation(String transferStation) {
        this.transferStation = transferStation;
    }

    public Integer getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(Integer batchStatus) {
        this.batchStatus = batchStatus;
    }

    public Long getCabinId() {
        return cabinId;
    }

    public void setCabinId(Long cabinId) {
        this.cabinId = cabinId;
    }

    public String getCabinName() {
        return cabinName;
    }

    public void setCabinName(String cabinName) {
        this.cabinName = cabinName;
    }

    /**
     *  舱位名称
     **/
    private String cabinName;
}
