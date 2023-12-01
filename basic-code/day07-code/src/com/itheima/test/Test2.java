package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
//        输出当前范围内有多少个质数
        boolean flag = false;
        int count = 0; //质数个数
        for (int i = 102; i < 200; i++) {
//            判断每一个数字是不是质数

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);


////        判断当前数字是不是质数
//        int i = 11; //判断2-（i-1）是不是还能被i除尽
//        boolean flag = false;
//        for (int j = 2; j < i; j++) {
//            if(i % j == 0) {
//                flag = true;
//            }
//        }
//        if(flag) {
//            System.out.println("当前数字是质数");
//        }else{
//            System.out.println("当前数字不是质数");
//        }
    }
}
