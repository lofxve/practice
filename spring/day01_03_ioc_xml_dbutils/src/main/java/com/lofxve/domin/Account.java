package com.lofxve.domin;

import lombok.Data;

/**
 * @ClassName Account
 * @Author lofxve
 * @Date 2021/1/2 22:25
 * @Version 1.0
 */
@Data
public class Account {
    private Integer aid;
    private String name;
    private Double balance;


@Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}