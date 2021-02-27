package com.lofxve.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @ClassName DouDiZhu
 * @Author lofxve
 * @Date 2020/12/18 11:11
 */
public class DouDiZhu {
    /*
    斗地主综合案例:
        1.准备牌
        2.洗牌
        3.发牌
        4.排序
        5.看牌
    */
    public static void main(String[] args) {
        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        int index = 0;

        poker.put(index,"大王");
        pokerIndex.add(index++);

        poker.put(index,"小王");
        pokerIndex.add(index++);

        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♠","♥","♣","♦");
//        1.准备牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index++);
            }
        }
//        2.洗牌
        Collections.shuffle(pokerIndex);
//        3.发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer pi = pokerIndex.get(i);
            if(i>=51){
                //给底牌发牌
                diPai.add(pi);
            }else if(i%3==0){
                //给玩家1发牌
                player01.add(pi);
            }else if(i%3==1){
                //给玩家2发牌
                player02.add(pi);
            }else if(i%3==2){
                //给玩家3发牌
                player03.add(pi);
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        lookPoker("周润发",poker,player01);
        lookPoker("周星驰",poker,player02);
        lookPoker("刘德华",poker,player03);
        lookPoker("底牌",poker,diPai);

    }

    private static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> player01) {
        System.out.print(name+": ");
        for (Integer integer : player01) {
            String s = poker.get(integer);
            System.out.print(s+" ");
        }
        System.out.println();
    }

}