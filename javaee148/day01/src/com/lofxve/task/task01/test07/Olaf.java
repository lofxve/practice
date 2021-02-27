package com.lofxve.task.task01.test07;

/**
 * @ClassName Olaf
 * @Author 魏振东
 * @Date 2020/12/12 18:16
 */
public class Olaf extends Hero{
    public Olaf() {
        super("奥拉夫",500,500,500,500);
    }

    @Override
    public void one(Hero hero) {
        this.startAnility(new Ability("逆流投掷",0.2,12),hero);
    }

    @Override
    public void two(Hero hero) {
        this.startAnility(new Ability("残暴打击",0.5,120),hero);
    }

    @Override
    public void three(Hero hero) {
        this.startAnility(new Ability("鲁莽挥击",0.8,240),hero);
    }

    @Override
    public void actorSLines() {
        System.out.println("来吧，我不会伤害你的，我保证");
    }

}