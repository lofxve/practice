package com.lofxve.com.bianlifeng;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 便利店结账时间
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 在便利店中顾客的结账时间是很重要的指标。结账时间由排队等待时间，和顾客操作付款时间两部分组成。
 *
 * 程序输入为顾客列表 customers，每一位顾客 customer[i] 包含两个数值 arriveTime, payDuration。
 *
 * arriveTime 表示顾客挑选完商品去结账的时刻；
 *
 * payDuration 表示顾客操作付款的时间。
 *
 * 请计算所有顾客的总结账时间。
 *
 *
 *
 * 输入描述
 * 第一行：总顾客数
 *
 * 剩余行：每位顾客的 arriveTime, payDuration。
 *
 * 如：
 *
 * 3
 *
 * 1,2
 *
 * 2,5
 *
 * 4,3
 *
 * 第一位顾客在时刻 1 到达，付款耗时 2。结账时间为 2；
 *
 * 第二位顾客在时刻 2 到达，等待顾客 1 结账完成，在时刻 3 开始付款，付款耗时 5。结账时间为 6；
 *
 * 第三位顾客在时刻 4 到达，等待顾客 2 结账完成，结账时间为 7；
 *
 * 共计 2 + 6 + 7 = 15。
 *
 *
 *
 * 每一行的数据按照 arriveTime 递增顺序排列。如果两位顾客 arriveTime 相同，排在前面的顾客先结账。
 *
 * 最终输出结果不超过 2^31 - 1；arriveTime 取值范围为 [1, 2^63 - 1] 间的正整数；payDuration 取值范围为 [1, 2^31 - 1] 间的正整数。
 *
 * 输出描述
 * 15
 *
 *
 * 样例输入
 * 3
 * 1,2
 * 2,5
 * 4,3
 * 样例输出
 * 15
 * @ClassName Test02
 * @Author lofxve
 * @Date 2021/3/20 15:22
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        int n = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] split = s.split(",");
            Customer customer = new Customer(Integer.valueOf(split[0]),Integer.valueOf(split[2]));
            customers.add(customer);
        }
    }
}
class Customer {
    public Integer getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Integer arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Integer getPayDuration() {
        return payDuration;
    }

    public void setPayDuration(Integer payDuration) {
        this.payDuration = payDuration;
    }

    public Integer arriveTime;
    public Integer payDuration;

    public Customer() {
    }

    public Customer(Integer arriveTime, Integer payDuration) {
        this.arriveTime = arriveTime;
        this.payDuration = payDuration;
    }
}
