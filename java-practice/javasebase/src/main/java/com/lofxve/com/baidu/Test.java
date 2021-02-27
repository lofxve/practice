package com.lofxve.com.baidu;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 李华顺利地到达了巴黎，他的好友Peter带他开启了他的巴黎之旅。
 *
 * 途中，李华遇到了许多心动的纪念品想要带回家，但是他又不想自己太累，而且他买纪念品也有相应的预算k，现给出他心动的纪念品清单：共有n件，其中每件都各有其价格price，重量weight，心动值v(其中心动值为1~5之间的数值)，需要注意的是：在心动值不同的情况下，李华会优先选择心动值大的纪念品；若心动值相同，李华会优先选择比较便宜的纪念品，具体见样例。同时给出李华在保证不累的情况下，最多能拿的物品重量m。在不超过预算并且保证不累的情况下，李华最多可以带几件纪念品回家？
 *
 *
 *
 * 输入描述
 * 单组输入。
 *
 * 第1行三个正整数，分别为：纪念品件数n，最多能拿的物品重量m，预算k。（n<1e5,m<100,k<10000,k的单位为元，m的重量为kg）
 *
 * 第2行到第n+1行，分别为每件物品的价格price，重量weight，心动值v。（price<10000,weight<100,v为1~5之间的整数，price的单位为元，weight的重量为kg）
 *
 * 输出描述
 * 在不超过预算并且保证不累的情况下，李华最多可以带回家的纪念品件数。
 *
 *
 * 样例输入
 * 3 10 1000
 * 100 5 3
 * 50 3 2
 * 300 3 3
 * 样例输出
 * 2
 *
 * 提示
 * 由于李华会优先选择心动值大的物品，所以李华选择了第一件和第三件物品。
* */
//创建对象Petet
class Petet{

    private int price;
    private int weight;
    private int v;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }


}
public class Test {
    public static void main(String[] args) {
        //输入数据
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        if(m>=100||k>=10000)
            return;
        ArrayList<Petet> arr = new ArrayList<>();
        for (int i = 0;i<n;i++){
            int p = input.nextInt();
            int w = input.nextInt();
            int v = input.nextInt();
            if(v>=5||v<1)
                return;
            Petet petet = new Petet();
            petet.setPrice(p);
            petet.setWeight(w);
            petet.setV(v);
            arr.add(petet);
        }
        //冒泡排序心动值
         for (int i = 0;i<n;i++){
             for (int j = 1;j<n-i;j++){
                 if(arr.get(j).getV() > arr.get(j-1).getV()){
                     Petet temp = arr.get(j);
                     arr.remove(j);
                     arr.add(j,arr.get(j-1));
                     arr.remove(j-1);
                     arr.add(j-1,temp);
                 }
             }
         }
//         for (Petet petet :arr){
//             System.out.println(petet.toString());
//             System.out.println(petet.getPrice());
//             System.out.println(petet.getWeight());
//             System.out.println(petet.getV());
//         }
         int kk = 0;
         int i = 0;
         while (i!=arr.size()-1){
             int mm = 0;
             if(m<=0||k<=0)
                 System.out.println(kk);
             //心动值相同
             if (arr.get(i).getV() == arr.get(i+1).getV()){
                 //如果心动值相同则获取价格便宜的
                 if(arr.get(i).getPrice() < arr.get(i+1).getPrice() && arr.get(i).getPrice()<k) {
                     mm=arr.get(i).getWeight();
                     arr.remove(i);
                     m = m - mm;
                     k = k - arr.get(i).getPrice();
                     kk++;
                 }else if(arr.get(i).getPrice() > arr.get(i+1).getPrice() && arr.get(i+1).getPrice()<k){
                     mm=arr.get(i+1).getWeight();
                     arr.remove(i+1);
                     m = m - mm;
                     k = k - arr.get(i+1).getPrice();
                     kk++;
                 }else{
//                    如果心动值和价格都相同，获取重量轻的
                     if(arr.get(i).getWeight() <= arr.get(i+1).getWeight() && arr.get(i).getPrice()<k) {
                         mm=arr.get(i).getWeight();
                         arr.remove(i);
                         m = m - mm;
                         k = k - arr.get(i).getPrice();
                         kk++;
                     }else if(arr.get(i).getWeight() > arr.get(i+1).getWeight() && arr.get(i+1).getPrice()<k){
                         mm=arr.get(i+1).getWeight();
                         arr.remove(i+1);
                         m = m - mm;
                         k = k - arr.get(i+1).getPrice();
                         kk++;
                     }
                 }
             }else{

                 mm=arr.get(i).getWeight();
                 arr.remove(i);
                 m = m - mm;
                 k = k - arr.get(i).getPrice();
                 kk++;
             }
         }
    }
}
