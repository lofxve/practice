package com.lofxve.task.task01.test06;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 19:32
 */
public class Dome {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.eat();
        c.eat();

        if (d instanceof Dog) {
            Dog dog = (Dog) d;
            dog.lookHome();
        }
        if (c instanceof Cat) {
            Cat cat = (Cat) c;
            cat.catchMouse();
        }
    }
}