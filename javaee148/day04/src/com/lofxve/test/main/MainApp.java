package com.lofxve.test.main;

import com.lofxve.test.pojo.Person;
import com.lofxve.test.pojo.Student;
import com.lofxve.test.pojo.Teacher;
import com.lofxve.test.util.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName MainApp
 * @Author 魏振东
 * @Date 2020/12/15 16:02
 */
public class MainApp {
    public static void main(String[] args) {
        /**
         * 创建Scanner
         * 创建Arraylist<Student>
         * 创建Arraylist<Teacher>
         *  死循环 重复执行
         *打印功能菜单
         * 获取用户输入的功能实现
         * 根据用户的功能选项，选择对应的功能
         **/

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        while (true) {
            System.out.println("---------------------------欢迎使用管理系统--------------------------------");
            System.out.println("1.学员信息管理   2.教师信息管理   3.退出");
            //6.获取用户输入的功能选项
            System.out.println("请选择您要执行的功能:");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Manager(sc, students, teachers,"学员");
                    break;
                case 2:
                    Manager(sc, students, teachers,"教师");
                    break;
                case 3:
                    System.out.println("欢迎您继续使用...");
                    System.exit(500);
                default:
                    System.out.println("您输入的功能选项:" + choose + "不存在,请重新输入!");
                    break;
            }
        }
    }

    private static void Manager(Scanner sc, ArrayList<Student> students, ArrayList<Teacher> teachers,String type) {
        System.out.println("---------------------------欢迎使用"+type+"信息管理--------------------------------");
        //1.定义一个死循环让功能重复执行
        while (true) {
            //2.在死循环中打印学员信息管理的菜单
            System.out.println("1.添加"+type+"  2.修改"+type+"  3.删除"+type+"  4.查询"+type+"  5.返回");
            //3.获取用户输入的功能选项
            System.out.println("请输入你要选择的功能:");
            int choose = sc.nextInt();
            //4.创建一个switch语句,根据用户输入的功能选项,选择对应的功能
            switch (choose) {
                case 1:
                    //1.添加学员==>调用添加学员的方法
                    add(sc, students, teachers, type);
                    break;
                case 2:
                    //2.修改学员==>调用修改学员的方法
                    update(sc, students, teachers, type);
                    break;
                case 3:
                    //3.删除学员==>调用删除学员的方法
                    delete(sc, students,teachers, type);
                    break;
                case 4:
                    select(students);
                    //4.查询学员==>调用查询学员的方法
                    break;
                case 5:
                    //5.返回==>返回一级菜单
                    return;//结束方法
                default:
                    //用户输入不是12345,提示错误信息
                    System.out.println("您输入的功能选项:" + choose + "不存在,请重新输入!");
                    break;
            }
        }
    }

    private static void select(ArrayList<? extends Person> list) {
        System.out.println("---------------------------欢迎使用查询功能--------------------------------");
        if (list.size() == 0) {
            System.out.println("[查询结果]");
            System.out.println("您还没有添加信息,请添加后在进行查询!");
        } else {
            Utils.printArrayList(list);
        }
    }

    private static void delete(Scanner sc, ArrayList<Student> students, ArrayList<Teacher> teachers, String type) {
        List<? extends Person> list = null;
        System.out.println("请输入你要删除的"+type+"id:");
        int id = sc.nextInt();
        if ("学员".equals(type)) {
            list = students;
        } else {
            list = teachers;
        }
        for (Person person : list) {
            if (id == person.getId()) {
                //4.如果用户输入的学员id和遍历得到的学员id一样,进行修改
                //5.先调用工具类中打印学员信息的方法,打印要删除的学员信息
                System.out.println("[查询结果]要删除的"+type+"信息:");
                Utils.printPerson(person);
                //6.获取用户是否确定删除的选项y|n
                System.out.println("您确定要删除id是["+id+"]的吗?y|n");
                String yesAndNo = sc.next();
                //7.根据用户输入的yesAndNo确定是否删除学员信息
                if("y".equalsIgnoreCase(yesAndNo)){
                    //输入y|Y:删除学员
                    //在集合中删除学员
                    list.remove(person);
                    //提示用户"恭喜您id是["+id+"]的学员信息删除成功!"
                    System.out.println("恭喜您id是["+id+"]的"+type+"信息删除成功!");
                    //结束删除学员的方法
                    return;
                }else{
                    //输入n|N:取消删除
                    //提示用户"[删除操作已经取消!]"
                    System.out.println("[删除操作已经取消!]");
                    //结束删除学员的方法
                    return;
                }
            }
        }
    }

    private static void update(Scanner sc, ArrayList<Student> students, ArrayList<Teacher> teachers, String type) {
        List<? extends Person> list = null;
        //1.获取用户要修改的学员id
        System.out.println("请输入要修改的id:");
        int id = sc.nextInt();
        if ("学员".equals(type)) {
            list = students;
        } else {
            list = teachers;
        }
        for (Person person : list) {
            if (id == person.getId()) {
                System.out.println("[查询结果]要修改的"+type+"信息:");
                Utils.printPerson(person);
                System.out.println("请输入新的姓名(输入0保留原值):");
                String name = sc.next();
                System.out.println("请输入新的性别(输入0保留原值):");
                String sex = sc.next();
                System.out.println("请输入新的出生日期(yyyy-MM-dd)(输入0保留原值):");
                String birthday = sc.next();
                //7.判断用户输入的数据是否为0,不是0替换
                if (!"0".equals(name)) {
                    person.setName(name);
                }
                if (!"0".equals(sex)) {
                    person.setSex(sex);
                }
                if (!"0".equals(birthday)) {
                    person.setBirthday(birthday);
                }
                System.out.println("恭喜您id是[" + id + "]的"+type+"信息修改成功!");
                return;
            }
        }
    }

    private static void add(Scanner sc, ArrayList<Student> studentArrayList, ArrayList<Teacher> teacherArrayList, String type) {
        System.out.println("---------------------------欢迎使用添加"+type+"功能--------------------------------");
        //1.获取用户输入的学员信息(姓名,性别,出生日期)
        System.out.println("请输入"+type+"姓名:");
        String name = sc.next();
        System.out.println("请输入"+type+"性别:");
        String sex = sc.next();
        System.out.println("请输入"+type+"的出生日期(yyyy-MM-dd):");
        String birthday = sc.next();
        if ("学员".equals(type)) {
            studentArrayList.add(new Student(++Utils.stuId, name, sex, birthday));
        } else {
            teacherArrayList.add(new Teacher(++Utils.tecId, name, sex, birthday));
        }
    }
}