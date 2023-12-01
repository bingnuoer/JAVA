package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        getCircularArea(1.1);
    }

    //    方法-求圆的面积
    public static void getCircularArea(double r) {
        double area = 3.14*(r*r);
        System.out.println(area);
    }
}
