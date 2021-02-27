package com.lofxve.base.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * ┌ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ┐
 * │   (\_(\     (\_/)     (\_/)     (\_/)      (\(\   │
 *     ( -.-)    (•.•)     (>.<)     (^.^)     (='.')
 * │  C(")_(")  (")_(")   (")_(")   (")_(")   O(_")")  │
 * └ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ┘ 
 **/
public class LambdaDome {
    public static void main(String[] args) {
        String[] strings = {"dsfghhdf", "sdfhi", "sdhfio", "asdhfi"};
        Arrays.sort(strings,((o1, o2) ->{return o1.compareTo(o2);}));
        System.out.println(String.join(",",strings));

        List<String> names = Arrays.asList(strings);
        List<person> personList = names.stream().map(person::new).collect(Collectors.toList());
        personList.forEach(l->{
            System.out.println(l.getName());
        });
    }
}
class person{
    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public person(String name){
        this.name = name;
    }
}
