package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
//        键盘录入电影票号 1-100有效
//        奇数，打印坐左边
//        偶数，打印坐右边
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票号：");
        int number = sc.nextInt();
        if (number >= 1 && number <= 100) {
            if (number % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }

    }
}
