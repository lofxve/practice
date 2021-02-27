package com.lofxve.classtest.interfacedome;

public interface AI {
    public static final int a = 10;

    public abstract void ai();

    public default void show2(){
        System.out.println("ai-");
    }
}
