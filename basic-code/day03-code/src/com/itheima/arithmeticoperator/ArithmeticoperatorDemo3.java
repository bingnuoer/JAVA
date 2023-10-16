package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte a = 100;
        byte b = 100;
//        int c = a + b;
//        System.out.println(c); //30
        byte c = (byte)(a+b);
        System.out.println(c); //-56,byte最大范围到127，超过byte最大取值范围
    }
}
