package com.lofxve.task.task02.test03;

import com.lofxve.task.task01.test05.C;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 20:30
 */
public class Dome {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();

        if (a instanceof Cat){
            Cat cat = (Cat)a;
            cat.eat();
            cat.catchMouse();
        }
    }
}