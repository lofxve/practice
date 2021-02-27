package com.lofxve.test.student1.util;

import com.lofxve.test.student1.pojo.Person;
import com.lofxve.test.student1.pojo.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName Utils
 * @Author 魏振东
 * @Date 2020/12/15 15:47
 */
public class Utils {
    public static int sutId;
    public static int tecId;

    public Utils() {
    }
    public static void pintPerson(Person p){
        System.out.println("************************************************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        System.out.println(p);
        System.out.println("************************************************************************************");
    }
    public static void printPersonlist(ArrayList<? extends Person> list){
        System.out.println("************************************************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        //遍历集合,获取每一个Student|Teacher对象
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println("************************************************************************************");
    }

    public static int birthdayToAge(String birthday) {
        //把String类型的生日转换为Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //把Date变量定义在try的外边,提高变量的作用域,方便后边可以使用
        Date birthdayDate = null;
        try {
            birthdayDate = sdf.parse(birthday);
        } catch (ParseException e) {
            //异常的处理逻辑:出现了异常之后要做的事情
            return -1;
        }
        //获取当前的日历对象
        Calendar calendarNow = Calendar.getInstance();
        //使用Calendar对象中的方法setTime把生日转换为Calendar对象
        Calendar calendarBir = Calendar.getInstance();
        calendarBir.setTime(birthdayDate);

        /*
            boolean before(Object when) 判断此 Calendar 表示的时间是否在指定 Object 表示的时间之前，返回判断结果。
         */
        if (calendarNow.before(calendarBir)) {
            //true:当前日期在出生日期之前说明人还未出生
            return -1;
        }

        //获取当前日期的年与日
        int yearNow = calendarNow.get(Calendar.YEAR);
        int monthNow = calendarNow.get(Calendar.MONTH);
        int dateNow = calendarNow.get(Calendar.DATE);
        //获取生日日期的年与日
        int yearBir = calendarBir.get(Calendar.YEAR);
        int monthBir = calendarBir.get(Calendar.MONTH);
        int dateBir = calendarBir.get(Calendar.DATE);

        //使用当前的年-生日年,粗略的计算出年龄  2020-9-15   2002-9-14|2002-9-16|2002-8-11|2002-10-11
        int age = yearNow - yearBir;//2020-2002 = 18
        //判断当前月份和出生的月份比较
        if (monthNow <= monthBir) {
            //当前的月份==出生日期
            if (monthNow == monthBir) {
                //对日进行判断 当前日<出生日  2020-9-15  2002-9-16
                if (dateNow < dateBir) {
                    age--;
                }
            } else {
                //当前的月份<出生日期:还未过生日,年龄-1
                age--;
            }
        }
        //当前的月份>出生日期:已经过生日
        return age;
    }
}