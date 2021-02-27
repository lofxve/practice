package com.lofxve.com.tengxun;

import java.util.ArrayList;
import java.util.Scanner;

public class Test0906_3 {

    public static void bubblesort(ArrayList<Qi> arr){
        int len = arr.size();
        for (int i = 0;i<len;i++){
            if(arr.get(i).ch == 'R'){
                for (int j = 1; j<len-i;j++){
                    if(arr.get(j-1).k > arr.get(j).k && arr.get(j-1).ch == 'R' && arr.get(j).k == 'R'){
                        Qi temp = arr.get(j-1);

                        arr.remove(j-1);
                        arr.add(j-1,arr.get(j));

                        arr.remove(j);
                        arr.add(j,temp);
                    }
                }

            }else{
                for (int j = 1; j<len-i;j++){
                    if(arr.get(j-1).k > arr.get(j).k && arr.get(j-1).ch == 'B' && arr.get(j).k == 'B'){
                        Qi temp = arr.get(j-1);

                        arr.remove(j-1);
                        arr.add(j-1,arr.get(j));

                        arr.remove(j);
                        arr.add(j,temp);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Qi> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.nextLine();
        for(int i = 0;i<n;i++){
            int a = input.nextInt();
            Qi qi = new Qi(a, str.charAt(i));
            arr.add(qi);
        }

    }
}
class Qi{
    int k;
    char ch;
    Qi(int k ,char ch){
        this.k=k;
        this.ch = ch;
    }
}
