package com.lofxve.classtest.invocationHandler;

/**
 * @ClassName Star
 * @Author lofxve
 * @Date 2020/12/31 16:46
 * @Version 1.0
 */
//培养明星的接口
public interface Star {
    //定义唱歌方法
    public abstract void changGe();
    //定义跳舞方法
    public abstract void tiaoWu();
    //定义rap方法
    public abstract void rap();
    //定义篮球方法
    public abstract void lanQiu();
    //定义足球方法
    public abstract void zuQiu();
    //定义直播带货方法
    public abstract String zhiBoDaiHuo(double money);
}