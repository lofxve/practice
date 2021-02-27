package com.lofxve.classtest.genenicdome;

/**
 * @ClassName GenenicDome
 * @Author com.lofxve
 * @Date 2020/12/17 11:22
 */
public class GenenicDome<T,K> {
    private T name;

    private K age;

    public GenenicDome() {
    }

    public GenenicDome(T name, K age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public K getAge() {
        return age;
    }

    public void setAge(K age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GenenicDome{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}