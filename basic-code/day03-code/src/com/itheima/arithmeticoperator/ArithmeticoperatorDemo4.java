package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo4 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;// 先用后加 y=x=10 x=11
        int z = ++x;// 先加后用 x=12 z=x=12
        System.out.println(x); //12
        System.out.println(y); //10
        System.out.println(z); //12
    }
}
