package com.lofxve.dp.creational.builder.ffr;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.dp.creational.builder
 * @ClassName: Meal
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/9 9:37
 * @Version: 1.0
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
