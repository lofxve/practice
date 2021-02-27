package com.lofxve.test.ticket;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 17:00
 */
public class Dome {
    public static void main(String[] args) {
        AirTicket airTicket = new AirTicket();
        airTicket.change();

        RailwayTicket railwayTicket = new RailwayTicket();
        railwayTicket.change();

        Sales sales = new Sales();
        sales.sell(new RailwayTicket("火车票", "500", "2015-02-03"));
        sales.sell(new AirTicket("飞机", "5000", "2015-02-03"));
        sales.sell(new GuGongTicket("故宫门票", "1500", "2012-02-03"));
        sales.sell(new ConcertsTicket("演唱会门票", "1200", "2013-02-03"));
    }
}