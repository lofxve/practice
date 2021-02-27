package com.lofxve.task.task01.test07;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/12 18:18
 */
public class Dome {
    public static void show(Hero hero){
        System.out.println(hero.toString());
    }
    public static void main(String[] args) {
        Annie annie = new Annie();
        Olaf olaf = new Olaf();
        annie.one(olaf);
        show(annie);
        show(olaf);
    }
}