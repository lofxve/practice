package com.lofxve.task.task01.test09;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GouWuChe
 * @Author 魏振东
 * @Date 2020/12/13 19:54
 */
public class GouWuChe {
    private ArrayList<Goods> arr =  new ArrayList<Goods>();

    public GouWuChe() {
    }

    public GouWuChe(ArrayList<Goods> arr) {
        this.arr = arr;
    }

    public ArrayList<Goods> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Goods> arr) {
        this.arr = arr;
    }

    public void addGoods(Goods goods){
        if (arr.add(goods)){
            System.out.println("加入"+goods.getName()+"成功");
        }else {
            System.out.println("加入失败");
        }
    }
    public void showGoods(){
        System.out.println("您选购的商品为：");
        for (Goods goods : arr) {
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice());
        }
    }
    public void total(){
        double oldtotal = 0.0;
        double newtotal = 0.0;
        for (Goods goods : arr) {
            oldtotal+=goods.getPrice();
            if (goods instanceof EGoods){
                newtotal+=goods.getPrice()*0.88;
            }else{
                newtotal+=goods.getPrice();
            }
        }
        System.out.println("原 价为："+oldtotal+"元");
        System.out.println("折后为："+newtotal+"元");
    }

}