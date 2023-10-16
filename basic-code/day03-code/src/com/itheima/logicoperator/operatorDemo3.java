package com.itheima.logicoperator;

public class operatorDemo3 {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);

        System.out.println("--------------------");

        System.out.println(true || false);
        System.out.println(false || false);

        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(a);
        System.out.println(b); // b不参与运算
        System.out.println(result);
    }
}
