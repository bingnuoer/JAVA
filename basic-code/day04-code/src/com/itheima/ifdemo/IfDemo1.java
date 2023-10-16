package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
//        键盘录入酒量
//        酒量 > 2 输出
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量：");
        int wine = sc.nextInt();

        if (wine > 2) {
            System.out.println("小伙子，不错呀！");
        }
    }
}
