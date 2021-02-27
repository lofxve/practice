package com.lofxve;

import org.omg.CORBA.OMGVMCID;
import sun.awt.im.SimpleInputMethodWindow;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

/**
 * @ClassName Main
 * @Author com.lofxve
 * @Date 2020/12/16 17:25
 */
public class Main extends Object {
    /**
     * 接口中不存在构造方法，所以不能创建对象
     * 多态继承的前提，子父类继承或者实现接口
     **/
    public static void main(String[] args) {
        /**
         * 子类继承父类，就集成父类的成员变量和成员方法，构造方法和私有属性除外
         * 子类有就调用子类的子类没有就调用父类，父类没有就报错
         * 方法重写，发生在两个类中，一般方法之间具有继承关系，方法的返回值，方法名，参数列表，都相同，权限修饰符，子类大于等于父类
         * this调用本类的成员变量或者方法，this（）表示调用本类，this（参数）表示调用本类有参数构造方法
         * 抽象方法就是abstract 修饰的方法体，没有方法体
         * public abstract void eat();
         * 父类抽象方法的意义就是，强制子类重写父类方法
         * final 修饰类，类不能被继承
         * 修饰方法，方法不能被重写
         * 修饰成员变量，必须在创建对象前赋值（可以在构造方法中赋值，或者直接赋值）
         * 修饰局部变量，基本数据类型其值不能改变，修饰对象则其地址不能改变
         *
         **/

        /**
         * Person.P
         * Person.show(参数）
         * public interface fun{
         *     public abstract void show() 抽象方法，必须重写，
         *     public default void show() 默认方法，可以选择重写，多时间发生冲突的时候，必须重写
         *     public static void show() 静态方法，不需要重写
         * }
         * public class Person implements fun{
         * 变量 public static final int a = 2;
         *
         * }
         * 多态的前提：子父类集成
         * 多态的格式
         * Dad d = new Son();
         * Son s = (Son)d;
         *
         * 成员内部类：定义在成员方法外，类中，局部内部类：定义在成员方法中，匿名内部类，简化代码，
         **/

        /**
         *  default:只能在本包中使用
         *  public:项目中的所有都能类都能使用
         *  private：只限本类中使用
         *  protected：；既能在本包中使用，又能在不同包的子类中使用
         *  代码块
         *  public class Person(){
         *     static{
         *     静态代码块
         *     对象生成前执行，只执行一次
         *     }
         *     {
         *     构造代码块
         *     对象生成前执行，一般用作初始化变量
         *
         *     }
         *     public Person(){
         *     {
         *     成员代码块
         *     }
         *     }
         *  }
         *  静态代码块
         * 构造代码块
         * 成员代码块
         * 构造函数内部执行
         *Object 是所有类的父类，没有明确所集成的父类，则默认直接集成Object
         * toString
         * 不重写，则默认输出，项目包名和类名@地址的hashcode
         **/

        System.out.println(new Date());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));

        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 1);
        System.out.println(c.get(Calendar.YEAR));
        Date time = c.getTime();
        System.out.println(simpleDateFormat.format(time));

        c.setTime(new Date());
        System.out.println(simpleDateFormat.format(c.getTime()));
        c.set(2022, 12 - 1, 15, 12, 12, 12);
        System.out.println(simpleDateFormat.format(c.getTime()));

        System.out.println(simpleDateFormat.format(new Date(System.currentTimeMillis())));


        String str = "anbcskdfjaj";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.arraycopy(chars,0,chars,5,2);
        System.out.println(Arrays.toString(chars));
        System.exit(500);

        Integer integer = Integer.valueOf("10");
        System.out.println(integer);
        System.out.println(integer.intValue());

        /**
         * 类继承的特点
         * 单继承
         * 多级集成
         * 子类继承父类就继承了父类的成员和属性，私有属性和方法，以及构造方法除外
         * 子类可以定义自己特有的方法
         * 继承的优点
         * 提高的代码的复用性
         * 为多态提供了前提
         * 子类对父类产生了依赖
         * 子类要保留父类的方法但是要重写父类的行为
         * 方法重载，发生在同一个类中，出现方法名相同，但是参数列表不同的方法
         *抽象，抽取子类共性形成的类
         * 包含了抽象方法的类必须被定义为抽象类
         *
         **/

    }
}