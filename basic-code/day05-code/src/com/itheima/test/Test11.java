package com.itheima.test;

import java.util.Random;

public class Test11 {
    public static void main(String[] args) {
//        1. 定义1个空数组，长度是10
        int[] arr = new int[10];
        int sum = 0; //数组和
        double aver = 0; //平均数
        int count = 0; //比平均数小的个数
//        生成 10 个随机数
        Random r = new Random();

//        遍历数组，每生成1个随机数，就添加到数组里
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }
//        打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----------------------");

//        2. 求所有数和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有数和：" + sum);
//        3. 求所有数平均数
        aver = sum / arr.length;
        System.out.println("所有数平均数：" + aver);
//        4. 统计比平均数小的个数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < aver) {
                count++;
            }
        }
        System.out.println("比平均数小的个数：" + count);

//        遍历数组，验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
