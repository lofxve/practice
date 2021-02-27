package com.lofxve.task.task01.test06;

/**
 * @ClassName Manager
 * @Author 魏振东
 * @Date 2020/12/12 17:04
 */
public class Manager extends Employee {
    public Manager() {

    }

    public String getClerk() {
        return clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
    }

    public Manager(String name, String workId, String dept, String clerk) {
        super(name, workId, dept);
        this.clerk = clerk;
    }

    public Manager(String clerk) {
        this.clerk = clerk;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "clerk='" + clerk + '\'' +
                '}';
    }

    private String clerk;

    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println("他的职员是" + this.getClerk());
    }
}