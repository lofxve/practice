package com.lofxve.classtest.genenicdome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Dome
 * @Author lo
 * fxve
 * @Date 2020/12/17 11:25
 */
public class Dome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("wzd");
        strings.add("wzd");
        strings.add("wzd");
        strings.add("wzd");
        strings.add("fx");
        strings.add("fx");
        strings.add("fx");
        strings.add("fx");
        strings.add("fx");

        GenenicDome<List<String>,String> listGenenicDome = new GenenicDome<>();
        listGenenicDome.setName(strings);
        listGenenicDome.setAge("25");
        System.out.println(listGenenicDome);


        GenericInterfaceimpl<List<String>> listGenericInterfaceimpl = new GenericInterfaceimpl<List<String>>();
        listGenericInterfaceimpl.show(strings);
    }
}