package com.itheima.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数（数字形式）：");
        int week = sc.nextInt();

     /*   if (week >= 1 && week <= 7) {
            if (week >= 1 && week <= 5) {
                System.out.println("工作日");
            } else {
                System.out.println("休息日");
            }
        } else {
            System.out.println("输入不合法！");
        } */

        switch (week){
//            case穿透简化代码
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("工作日");
                break;
            case 6 :
            case 7 :
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
