package com.lofxve.task.task01.test06;

/**
 * @ClassName Employee
 * @Author 魏振东
 * @Date 2020/12/12 16:59
 */
public class Employee {
    private String name;
    private String workId;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(String name, String workId, String dept) {
        this.name = name;
        this.workId = workId;
        this.dept = dept;
    }

    public Employee() {
    }
    public void  showMsg(){
        System.out.println(this.getDept() + "的：" + this.getName() + "，员工编号：" + this.getWorkId());
    }
}