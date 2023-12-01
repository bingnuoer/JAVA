package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
//        调用方法
//        传递不同类型的值，调用方法重载
//        compare(10,20);
//        compare((byte)10,(byte)20);
        byte b1 = 10;
        byte b2 = 10;
        compare(b1,b2);
    }

    //    方法重载-方法名相同，参数个数/类型/顺序 不同
//    比较2个整数是否相同
    public static void compare(byte num1, byte num2) {
        System.out.println("byte");
        System.out.println(num1 == num2);
    }

    public static void compare(short num1, short num2) {
        System.out.println("short");
        System.out.println(num1 == num2);
    }

    public static void compare(int num1, int num2) {
        System.out.println("int");
        System.out.println(num1 == num2);
    }

    public static void compare(long num1, long num2) {
        System.out.println("long");
        System.out.println(num1 == num2);
    }

}
