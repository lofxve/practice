package com.lofxve.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ArraylistHashMapTask
 * @Author lofxve
 * @Date 2020/12/18 14:59
 */
public class ArraylistHashMapTask {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> stringArrayListHashMap = new HashMap<>();
        HashMap<String,HashMap<String, ArrayList<String>>> hashMaps = new HashMap<>();

        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1,"海港区", "山海关区", "北戴河区", "昌黎县");
        stringArrayListHashMap.put("秦皇岛市",arrayList1);
        hashMaps.put("河北省",stringArrayListHashMap);

        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2,"路北区", "路南区", "古冶区", "开平区");
        stringArrayListHashMap.put("唐山市",arrayList2);
        hashMaps.put("河北省",stringArrayListHashMap);

        ArrayList<String> arrayList3 = new ArrayList<>();
        Collections.addAll(arrayList3,"中原区", "金水区", "二七区", "管城回族区");
        stringArrayListHashMap.put("郑州市",arrayList3);
        hashMaps.put("河南省",stringArrayListHashMap);


        for (Map.Entry<String, HashMap<String, ArrayList<String>>> stringHashMapEntry : hashMaps.entrySet()) {
            System.out.println(stringHashMapEntry.getKey());
            HashMap<String, ArrayList<String>> value = stringHashMapEntry.getValue();
            for (String s : value.keySet()) {
                System.out.println(s);
                System.out.println(value.get(s));
            }
        }
    }
}