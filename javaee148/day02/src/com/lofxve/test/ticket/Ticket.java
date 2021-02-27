package com.lofxve.test.ticket;

/**
 * @ClassName Ticket
 * @Author 魏振东
 * @Date 2020/12/13 16:55
 */
public class Ticket {
    private String title;
    private String price;
    private String time;

    public Ticket() {
    }

    public Ticket(String title, String price, String time) {
        this.title = title;
        this.price = price;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}