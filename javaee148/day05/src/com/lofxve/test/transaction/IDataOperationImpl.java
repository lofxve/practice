package com.lofxve.test.transaction;

import com.lofxve.test.pojo.Person;
import com.lofxve.test.util.Utils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName IDataOperationImpl
 * @Author com.lofxve
 * @Date 2020/12/17 17:41
 */
public class IDataOperationImpl<E> implements IDataOperation<E> {
    public ArrayList<E> list = new ArrayList<>();

    @Override
    public boolean add(E t) {
        list.add(t);
        return false;
    }

    @Override
    public <T> boolean delete(T t) {
        Person e1 = (Person) t;
        System.out.println("请输入你要删除的"+e1.getType()+"id:");
        int id = Utils.sc.nextInt();
        for (E ee : list) {
            Person e2 = (Person) ee;
            if (id == e2.getId()) {
                //4.如果用户输入的学员id和遍历得到的学员id一样,进行修改
                //5.先调用工具类中打印学员信息的方法,打印要删除的学员信息
                System.out.println("[查询结果]要删除的"+e1.getType()+"信息:");
                Utils.printPerson(e2);
                //6.获取用户是否确定删除的选项y|n
                System.out.println("您确定要删除id是["+id+"]的吗?y|n");
                String yesAndNo = Utils.sc.next();
                //7.根据用户输入的yesAndNo确定是否删除学员信息
                if("y".equalsIgnoreCase(yesAndNo)){
                    //输入y|Y:删除学员
                    //在集合中删除学员
                    list.remove(ee);
                    //提示用户"恭喜您id是["+id+"]的学员信息删除成功!"
                    System.out.println("恭喜您id是["+id+"]的"+e1.getType()+"信息删除成功!");
                    //结束删除学员的方法
                    return true;
                }else{
                    //输入n|N:取消删除
                    //提示用户"[删除操作已经取消!]"
                    System.out.println("[删除操作已经取消!]");
                    //结束删除学员的方法
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public <T> boolean update(E e) {
        Person e1 = (Person) e;
        System.out.println("请输入你要修改的"+e1.getType()+"id:");
        int id = Utils.sc.nextInt();
        for (E ee : list) {
            Person e2 = (Person) ee;
            if (id == e2.getId()) {
                System.out.println("[查询结果]要修改的"+e1.getType()+"信息:");
                Utils.printPerson(e2);
                System.out.println("请输入新的姓名(输入0保留原值):");
                String name = Utils.sc.next();
                System.out.println("请输入新的性别(输入0保留原值):");
                String sex = Utils.sc.next();
                System.out.println("请输入新的出生日期(yyyy-MM-dd)(输入0保留原值):");
                String birthday = Utils.sc.next();
                //7.判断用户输入的数据是否为0,不是0替换
                if (!"0".equals(name)) {
                    e2.setName(name);
                }
                if (!"0".equals(sex)) {
                    e2.setSex(sex);
                }
                if (!"0".equals(birthday)) {
                    e2.setBirthday(birthday);
                }
                System.out.println("恭喜您id是[" + id + "]的"+e1.getType()+"信息修改成功!");
                return true;
            }
        }
        return false;
    }

    @Override
    public <T> E get(T t) {
        return null;
    }

    @Override
    public Collection<E> getAll() {
        if (list.size() == 0) {
            System.out.println("[查询结果]");
            System.out.println("您还没有添加信息,请添加后在进行查询!");
        } else {
            System.out.println("************************************************************************************");
            System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
            for (E e : list) {
                System.out.println(e);
            }
        }
        return null;
    }
}