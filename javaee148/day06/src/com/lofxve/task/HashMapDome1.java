package com.lofxve.task;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMapDome1
 * @Author lofxve
 * @Date 2020/12/18 14:10
 */
public class HashMapDome1 {
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)){
                map.put(aChar,map.get(aChar)+1);
            }else{
                map.put(aChar,1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            System.out.println(characterIntegerEntry.getKey()+" "+characterIntegerEntry.getValue());
        }
    }
}