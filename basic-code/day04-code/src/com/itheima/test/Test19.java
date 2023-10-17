package com.itheima.test;

public class Test19 {
    public static void main(String[] args) {
//        定义被除数
//        定义除数
//        被除数-除数 直到<0，记录减的次数count 就是商
        int dividend = 100;
        int divisor = 10;
        int count = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor; //不断减,dividend记录的就是余数了
            count++; // 减一次，商+1
        }
        System.out.println("商：" + count); // 商
        System.out.println("余数：" + dividend);//余数

    }
}
