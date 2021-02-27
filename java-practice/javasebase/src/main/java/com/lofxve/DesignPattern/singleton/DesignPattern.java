package com.lofxve.DesignPattern.singleton;
/**
 * 饿汉式
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * 它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。*/
public class DesignPattern {
    //创建一个对象
    private static DesignPattern intance = new DesignPattern();
    //使用类不能实例化
    private DesignPattern(){}
    //提供外部获取的接口
    static DesignPattern getInstance(){
        return intance;
    }
    public void showmanagess(){
        System.out.println("hello,world!");
    }
}

/**懒汉式 线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * */
class DesignPattern1{
    private static DesignPattern1 intance;
    private DesignPattern1(){}
    private static DesignPattern1 getintance(){
        if (intance == null){
            intance = new DesignPattern1();
        }
        return intance;
    }
}

/**饿汉式 线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
class DesignPattern2{
    private static DesignPattern2 intance;
    private DesignPattern2(){

    }
    private static synchronized DesignPattern2 getInstance(){
        if(intance == null){
            intance = new DesignPattern2();
        }
        return intance;
    }
}

class Tesc {
    public static void main(String[] args) {
        DesignPattern obj = DesignPattern.getInstance();
        obj.showmanagess();
    }
}
