package com.lofxve.classtest.extendsdome;

/**
 * @ClassName Worker
 * @Author 魏振东
 * @Date 2020/12/11 10:50
 */
public class Worker {
    private String name;
    private String id;

    public Worker() {
    }

    public Worker(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void eat() {
        System.out.println(this.id + this.name + "在吃饭");
    }

    public void work() {
        System.out.println(this.id + this.name + "在工作");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}