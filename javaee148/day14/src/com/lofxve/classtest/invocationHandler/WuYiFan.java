package com.lofxve.classtest.invocationHandler;

/**
 * @ClassName WuYiFan
 * @Author lofxve
 * @Date 2020/12/31 16:46
 * @Version 1.0
 */
/*
    ctrl+r:查找并替换
 */
public class WuYiFan implements Star{
    @Override
    public void changGe() {
        System.out.println("吴亦凡在唱歌!");
    }

    @Override
    public void tiaoWu() {
        System.out.println("吴亦凡在跳舞!");
    }

    @Override
    public void rap() {
        System.out.println("吴亦凡在rap!");
    }

    @Override
    public void lanQiu() {
        System.out.println("吴亦凡在打篮球!");
    }

    @Override
    public void zuQiu() {
        System.out.println("吴亦凡在踢足球!");
    }

    @Override
    public String zhiBoDaiHuo(double money) {
        System.out.println("吴亦凡在直播带货,挣了"+money+"钱!");
        return "辣条";
    }
}