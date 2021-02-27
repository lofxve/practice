package com.lofxve.base.jige;

import com.lofxve.wzd.com.ManifestItemVo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        String h = "3H";
        String h1 = "2H";
        System.out.println(h.compareTo(h1));
        List<ManifestItemVo> manifestItemVoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ManifestItemVo manifestItemVo = new ManifestItemVo();
            manifestItemVo.setCabinName(i+"H");
            manifestItemVoList.add(manifestItemVo);
        }
        Collections.sort(manifestItemVoList, new Comparator<ManifestItemVo>() {
            @Override
            public int compare(ManifestItemVo o1, ManifestItemVo o2) {
//                return 1;
                return o1.getCabinName().compareTo(o2.getCabinName());
            }
        });
        manifestItemVoList.forEach(l->{
            System.out.println(l.getCabinName());
        });
    }
}
