package com.lofxve.test.student1.main;

import com.lofxve.test.student1.pojo.Person;
import com.lofxve.test.student1.pojo.Student;
import com.lofxve.test.student1.pojo.Teacher;
import com.lofxve.test.student1.util.Utils;

import javax.sound.midi.Soundbank;
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
                    manager(sc, students, teachers, "学员");
                    break;
                case 2:
                    manager(sc, students, teachers, "教师");
                    break;
                case 3:
                    System.out.println("欢迎您下次使用");
                    System.exit(500);
                    break;
                default:
                    System.out.println("您输入的功能选项:" + choose + "不存在,请重新输入!");
                    break;
            }
        }
    }

    private static void manager(Scanner sc, ArrayList<Student> students, ArrayList<Teacher> teachers, String type) {
        System.out.println("---------------------------欢迎使用" + type + "信息管理--------------------------------");
        while (true) {
            //2.在死循环中打印学员信息管理的菜单
            System.out.println("1.添加"+type+"  2.修改"+type+"  3.删除"+type+"  4.查询"+type+"  5.返回");
            //3.获取用户输入的功能选项
            System.out.println("请输入你要选择的功能:");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    add(sc, students, teachers, type);
                    break;
                case 2:
                    update(sc, students, teachers, type);
                    break;
                case 3:
                    delete(sc, students, teachers, type);
                    break;
                case 4:
                    if ("学员".equals(type)) {
                        select(students);
                    } else {
                        select(teachers);
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("您输入的功能选项:" + choose + "不存在,请重新输入!");
                    break;
            }
        }
    }

    private static void delete(Scanner sc, ArrayList<Student> students, ArrayList<Teacher> teachers, String type) {
        List<? extends Person> list = null;
        if ("学员".equals(type)) {
            list = students;
        } else {
            list = teachers;
        }
        System.out.println("请输入删除的id");
        int id = sc.nextInt();
        for (Person person : list) {
            if (id == person.getId()) {
                System.out.println("[查询结果]要修改的" + type + "信息:");
                Utils.pintPerson(person);
                System.out.println("是否确认删除Y");
                String choose = sc.next();
                if ("y".equals(choose)) {
                    list.remove(person);
                    System.out.println("恭喜您id是[" + id + "]的" + type + "信息删除成功!");
                } else {
                    System.out.println("操作取消");
                    return;
                }
            }
        }
    }

    private static void update(Scanner sc, ArrayList<Student> students, ArrayList<Teacher> teachers, String type) {
        List<? extends Person> list = null;
        if ("学员".equals(type)) {
            list = students;
        } else {
            list = teachers;
        }
        System.out.println("请输入修改的id");
        int id = sc.nextInt();
        for (Person person : list) {
            if (id == person.getId()) {
                System.out.println("[查询结果]要修改的" + type + "信息:");
                Utils.pintPerson(person);
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
                System.out.println("恭喜您id是[" + id + "]的" + type + "信息修改成功!");
                return;
            }
        }
    }

    private static void add(Scanner sc, ArrayList<Student> students, ArrayList<Teacher> teachers, String type) {
        //1.获取用户输入的学员信息(姓名,性别,出生日期)
        System.out.println("请输入" + type + "姓名:");
        String name = sc.next();
        System.out.println("请输入" + type + "性别:");
        String sex = sc.next();
        System.out.println("请输入" + type + "的出生日期(yyyy-MM-dd):");
        String birthday = sc.next();
        if ("学员".equals(type)) {
            students.add(new Student(++Utils.sutId, name, sex, birthday));
        } else {
            teachers.add(new Teacher(++Utils.sutId, name, sex, birthday));
        }
    }

    private static void select(ArrayList<? extends Person> list) {
        if (list.size() == 0) {
            System.out.println("[查询结果]");
            System.out.println("您还没有添加学员,请添加学员后在进行查询!");
        } else {
            Utils.printPersonlist(list);
        }
    }
}