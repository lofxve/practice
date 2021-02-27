package com.lofxve.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @ClassName DDZ
 * @Author lofxve
 * @Date 2020/12/18 14:16
 */
public class DDZ {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int index = 0;

        map.put(index,"大王");
        arrayList.add(index++);

        map.put(index,"小王");
        arrayList.add(index++);

        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors, "♠", "♥", "♣", "♦");

        for (String number : numbers) {
            for (String color : colors) {
                map.put(index,color+number);
                arrayList.add(index++);
            }
        }

        Collections.shuffle(arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            Integer integer = arrayList.get(i);
            if (i>=51){
                arrayList4.add(integer);
            }else if (i%3 == 0){
                arrayList1.add(integer);
            }else if (i%3 == 1){
                arrayList2.add(integer);
            }else if (i%3 == 2){
                arrayList3.add(integer);
            }
        }

        lookPker("1",map,arrayList1);
        lookPker("2",map,arrayList2);
        lookPker("3",map,arrayList3);
        lookPker("NAME",map,arrayList4);

    }

    private static void lookPker(String s, HashMap<Integer, String> map, ArrayList<Integer> arrayList1) {
        System.out.print(s+": ");
        for (Integer integer : arrayList1) {
            System.out.print(map.get(integer)+" ");
        }
        System.out.println();
    }
}