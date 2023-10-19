package com.itheima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        Random r = new Random();
//        包头不包尾，包左不包右


        for (int i = 1; i <= 100; i++) {
            int number = r.nextInt(10);
            System.out.println(number);
        }

    }
}
