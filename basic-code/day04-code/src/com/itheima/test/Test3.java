package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        键盘录入钱包余额
//        余额 > 100 吃网红餐厅
//                吃沙县小吃
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入钱包余额");
        double money = sc.nextInt();
        if (money > 100) {
            System.out.println("吃网红餐厅");
        } else {
            System.out.println("吃沙县小吃");
        }
    }
}
