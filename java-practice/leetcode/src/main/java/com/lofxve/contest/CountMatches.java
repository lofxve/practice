package com.lofxve.contest;

import java.util.List;

/**
 * @ClassName CountMatches
 * @Author lofxve
 * @Date 2021/3/6 20:53
 * @Version 1.0
 */
public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            switch (ruleKey){
                case "type":
                    if (item.get(0).equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "color":
                    if (item.get(1).equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "name":
                    if (item.get(2).equals(ruleValue)) {
                        count++;
                    }
                    break;
            }
        }
        return count;
    }
}
