package com.lofxve.classtest.invocationHandler;

/**
 * @ClassName CaiXuKun
 * @Author lofxve
 * @Date 2020/12/31 16:46
 * @Version 1.0
 */
public class CaiXuKun implements Star{
    @Override
    public void changGe() {
        System.out.println("蔡徐坤在唱歌!");
    }

    @Override
    public void tiaoWu() {
        System.out.println("蔡徐坤在跳舞!");
    }

    @Override
    public void rap() {
        System.out.println("蔡徐坤在rap!");
    }

    @Override
    public void lanQiu() {
        System.out.println("蔡徐坤在打篮球!");
    }

    @Override
    public void zuQiu() {
        System.out.println("蔡徐坤在踢足球!");
    }

    @Override
    public String zhiBoDaiHuo(double money) {
        System.out.println("蔡徐坤在直播带货,挣了"+money+"钱!");
        return "辣条";
    }
}