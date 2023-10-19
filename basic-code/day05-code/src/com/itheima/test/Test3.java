package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        判断质数

//        1.键盘录入一个正整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();
        boolean flag = true; // 默认是质数

//        2.循环判断，看2-(number-1)之间有没有被number整除的数
//        有:退出循环
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
//                修改flag的值即可
                flag = false;
//                System.out.println(number + "不是质数");
                break;
            }/* 错误代码
            else {
                System.out.println(number + "是质数");
            }*/
        }

        if(flag){
            System.out.println(number + "是质数");
        }else {
            System.out.println(number + "不是质数");
        }

    }
}
