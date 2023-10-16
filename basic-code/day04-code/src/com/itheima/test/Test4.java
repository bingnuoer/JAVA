package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入付款金额：");
        int pay = sc.nextInt();

        if (pay > 600) {
            System.out.println("付款成功");
        } else {
            System.out.println("付款失败");
        }
    }
}
