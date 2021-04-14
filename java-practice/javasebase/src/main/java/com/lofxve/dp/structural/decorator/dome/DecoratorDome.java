package com.lofxve.dp.structural.decorator.dome;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.structural.decorator.dome
 * @ClassName: DecoratorDome
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/14 15:16
 * @Version: 1.0
 */
// 游戏角色
interface Component {
    public void operation();
}

// 抽象类
abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
// 具体构件
class ConcreteComponent implements Component{
    public ConcreteComponent() {
        System.out.println("魔法少女");
    }
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
// 具体构件
class ConcreteComponent1 implements Component {
    public ConcreteComponent1() {
        System.out.println("恶魔");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
// 装饰器
class ConcreteDecotator extends Decorator{
    public ConcreteDecotator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能 变身狼外婆");
    }
}
// 装饰器
class ConcreteDecotator1 extends Decorator{
    public ConcreteDecotator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能 变身少女");
    }
}
public class DecoratorDome {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecotator concreteDecotator = new ConcreteDecotator(concreteComponent);
        concreteDecotator.operation();
        ConcreteDecotator1 concreteDecotator2 = new ConcreteDecotator1(concreteComponent);
        concreteDecotator2.operation();


        ConcreteComponent1 concreteComponent1 = new ConcreteComponent1();
        ConcreteDecotator1 concreteDecotator1 = new ConcreteDecotator1(concreteComponent1);
        concreteDecotator1.operation();
    }

}
