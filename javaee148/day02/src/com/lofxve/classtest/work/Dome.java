package com.lofxve.classtest.work;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 14:43
 */
public class Dome {
    public static void main(String[] args) {
        Worker cashier = new Cashier();
        cashier.name = "王收银";
        cashier.work();

        Cashier worker = (Cashier)cashier;
        worker.count();


//        Worker salas = new Salas();
//        salas.name = "王销售";
//        salas.work();
//
//        Manager manager = new Manager();
//        // 可以传入任何worker的子类对象
//        manager.talk(cashier);
//        manager.talk(salas);
        /**
         * 不能访问子类特有的成员
         **/
    }
}