package com.lofxve.DesignPattern.FactoryPattern.dome;

public class Factorydome {
    public static void main(String[] args) {
        NumberFactory factory = NumberFactory.getFactory();
        Number parse = factory.parse("10.245");
        System.out.println(parse);
    }
}
