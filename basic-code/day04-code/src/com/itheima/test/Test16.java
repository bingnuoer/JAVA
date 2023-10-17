package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
//        1.键盘录入2个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int min = sc.nextInt();
        System.out.println("请输入第二个数（要比第一个数大）：");
        int max = sc.nextInt();

        int count = 0; //计数
        if (min < max) {
            for (int i = min; i <= max; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        } else {
            System.out.println("输入不合法");
        }
    }
}
