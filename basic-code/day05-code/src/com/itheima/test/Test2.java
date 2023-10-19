package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        1.键盘录入一个整数x
        /*2.从1开始循环，求平方，
                =x 输出
                >x 输出前一个数（就是平方根）*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i * i == x) {
                System.out.println(x + "的平方根是" + i);
                break;
            } else if (i * i > x) {
                System.out.println(x + "平方根的整数部分是" + (i-1));
                break;
            }
        }
    }
}
