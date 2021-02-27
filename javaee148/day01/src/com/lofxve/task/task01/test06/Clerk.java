package com.lofxve.task.task01.test06;

/**
 * @ClassName Clerk
 * @Author 魏振东
 * @Date 2020/12/12 17:08
 */
public class Clerk extends Employee {
    private String manager;

    public Clerk() {

    }

    @Override
    public String toString() {
        return "Clerk{" +
                "manager='" + manager + '\'' +
                '}';
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Clerk(String name, String workId, String dept, String manager) {
        super(name, workId, dept);
        this.manager = manager;
    }

    public Clerk(String manager) {
        this.manager = manager;
    }

    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println("他的经理是" + this.getManager());
    }
}