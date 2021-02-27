package com.lofxve.classtest.stringdome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName StringDome
 * @Author 魏振东
 * @Date 2020/12/15 9:44
 */
public class StringDome {
    public static void main(String[] args) {
        show09();
    }

    private static void show09() {
        String[] a = "aa,cc,bb,dd".split(",");
        for (String s : a) {
            System.out.println(a);
        }
    }

    public static void show08() {
        System.out.println(" fshdufi dfsjios sfjoifjos".trim());
    }

    /**
     * toUpperCase toLowerCase
     *
     * @param []
     * @return void
     * @author weizhendong
     * @date 10:24 2020/12/15
     **/
    public static void show07() {
        System.out.println("abc".toUpperCase());
        System.out.println("ABC".toLowerCase());
        System.out.println("魏振东".toLowerCase());
    }

    /**
     * char[] byte[]
     *
     * @param []
     * @return void
     * @author weizhendong
     * @date 10:17 2020/12/15
     **/
    public static void show06() {
        String s = "abcd";
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

    }

    /**
     * substring
     *
     * @param []
     * @return void
     * @author weizhendong
     * @date 10:16 2020/12/15
     **/
    public static void show05() {
        String substring = "SDFJSDKFJISDFJAJVNJAJODFKKADFMKASDNFVAWOEPSCLXZ".substring(0, 2);
        System.out.println(substring);
    }

    /**
     * replace
     *
     * @param [list, target, replacement]
     * @return java.util.List<java.lang.String>
     * @author weizhendong
     * @date 10:09 2020/12/15
     **/
    public List<String> replaceList(List<String> list, String target, String replacement) {
        for (String s : list) {
            s.replace(target, replacement);
        }
        return list;
    }

    /**
     * index last
     *
     * @param []
     * @return void
     * @author weizhendong
     * @date 10:00 2020/12/15
     **/
    public static void show04() {
        int abc1 = "abc大家好Aabc大家好abc大家好abc大家好abc大家好abc大家好abc".indexOf("大家好A");
        int abc2 = "abc大家好Aabc大家好abc大家好abc大家好abc大家好abc大家好abc".lastIndexOf("大家好A");
        System.out.println(abc1);
        System.out.println(abc2);

    }

    /**
     * startsWith
     *
     * @param []
     * @return void
     * @author weizhendong
     * @date 9:59 2020/12/15
     **/
    public static void show03() {
        System.out.println("abc".endsWith("c"));
        System.out.println("abc".startsWith("ab"));
        String[] arr = {"hello.jar", "hello.txt", "hello.c", "hello.class", "hello.java", "hello.jar"};
        List<String> jar = new ArrayList<String>(Arrays.asList(arr)).stream().filter(o -> o.endsWith("jar")).collect(Collectors.toList());
        System.out.println(jar.toString());
    }

    /**
     * contains
     *
     * @param []
     * @return void
     * @author weizhendong
     * @date 9:59 2020/12/15
     **/
    public static void show02() {
        System.out.println("abc".contains("ab"));
    }

    /**
     * concat
     *
     * @param []
     * @return void
     * @author weizhendong
     * @date 9:59 2020/12/15
     **/
    public static void show01() {
        String string1 = "aa".concat("bb");
        System.out.println(string1);
    }


}