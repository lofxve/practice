package com.lofxve.task.task01.test07;

/**
 * @ClassName Annie
 * @Author 魏振东
 * @Date 2020/12/12 18:11
 */
public class Annie extends Hero{
    public Annie() {
        super("安妮",500,500,500,500);
    }

    @Override
    public void one(Hero hero) {
        this.startAnility(new Ability("碎裂之火",0.2,12),hero);
    }

    @Override
    public void two(Hero hero) {
        this.startAnility(new Ability("焚烧",0.5,120),hero);
    }

    @Override
    public void three(Hero hero) {
        this.startAnility(new Ability("提伯斯之怒",0.8,240),hero);
    }

    @Override
    public void actorSLines() {
        System.out.println("你见过我的小熊吗？");
    }
}