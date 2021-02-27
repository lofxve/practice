package com.lofxve.task.task01.test07;

/**
 * @ClassName Hero
 * @Author 魏振东
 * @Date 2020/12/12 17:33
 */
public abstract class Hero {
    //    名称；HP；MP；攻击力；防御；
    private String name;
    private double hp;
    private double mp;
    private double attackPower;
    private double defense;

    public Hero() {
    }
    public Hero(String name, double hp, double mp, double attackPower, double defense) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", attackPower=" + attackPower +
                ", defense=" + defense +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public abstract void one(Hero hero);

    public abstract void two(Hero hero);

    public abstract void three(Hero hero);

    public abstract void actorSLines();

    public void startAnility(Ability ability,Hero hero) {
        int consume = ability.getMpConsume();
        if (this.mp < consume) {
            System.out.println("没蓝了..");
        } else {
            this.mp -=consume;
            double hurt = (this.attackPower-100)*ability.getMultiple();
            hero.setHp(hero.getHp()-hurt);
            System.out.println(this.name+"使用技能"+ability.getName()+"对"+hero.getName()+"造成"+hurt+"点伤害。。");
        }
    }
}