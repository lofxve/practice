package com.lofxve.com.wangyi;

import java.util.*;

public class Main {
    public static boolean isString(HashMap<Character,Integer> map){
        for (Map.Entry<Character,Integer> m :map.entrySet()){
            if(m.getValue()%2!=0){
                return false;
            }
        }
        return true;
    }

    public static int theBaseString(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('b',0);
        map.put('c',0);
        map.put('x',0);
        map.put('y',0);
        map.put('z',0);
        int len = str.length();
        int k = 0;
        for(int i = 0;i < len;i++){
            char ch = str.charAt(i);
            Integer val = map.getOrDefault(ch,-1);
            if(val!=-1){
                map.put(ch,val+1);
            }
            if (isString(map)){
                if(k<i){
                    k=i;
                }
            }
        }
       return k+1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(theBaseString(str));
    }
}
