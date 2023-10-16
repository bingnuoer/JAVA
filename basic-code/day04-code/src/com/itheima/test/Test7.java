package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
        假设商品总价为1000。
        键盘录入会员级别，并计算出实际支付的钱。
        会员1级:打9折。
        会员2级:打8折。
        会员3级:打7折。
        非会员:不打折，要打也是打骨折。*/
        double totalPrice = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("录入会员级别：");
        int vip = sc.nextInt();

        if (vip == 1) {
            System.out.println("实际支付" + (totalPrice*0.9) + "元");
        } else if (vip == 2) {
            totalPrice *= 0.8;
            System.out.println("实际支付" + totalPrice + "元");
        } else if (vip == 3) {
            totalPrice *= 0.7;
            System.out.println("实际支付" + totalPrice + "元");
        } else {
            System.out.println("不打折");
        }

    }
}
