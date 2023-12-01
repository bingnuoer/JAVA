package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int price = sc.nextInt();
        System.out.println("请输入当前月份：");
        int mouth = sc.nextInt();
        System.out.println("请输入飞机舱位：0 头等舱，1 经济舱");
        int seat = sc.nextInt();
        int money = newPrice(price, mouth, seat);
        System.out.println("您优惠后的飞机票价为：" + money);
    }

    //    方法
    public static int newPrice(int price, int mouth, int seat) {

        if (mouth >= 5 && mouth <= 10) {
            //旺季
            price = getPrice(price, seat, 0.9, 0.85);
        } else if ((mouth >= 1 && mouth <= 4) || (mouth >= 11 && mouth <= 12)) {
            //淡季
            price = getPrice(price, seat, 0.7, 0.65);
        } else {
            System.out.println("输入不合法");
        }
        return price;
    }

    //   1、我要干什么： 把判断封装成方法，计算票价
    //   2、我需要什么：原价 仓位 头等舱折扣 经济舱折扣
    //   3、需要返回什么：折扣后的票价
    public static int getPrice(int price, int seat, double v0, double v1) {
        //头等舱
        if (seat == 0) {
            price = (int) (price * v0);
        } else if (seat == 1) {
            //经济舱
            price = (int) (price * v1);
        } else {
            System.out.println("请输入正确的舱位");
        }
        return price;
    }
}

