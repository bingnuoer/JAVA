package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        getRectangularPerimeter(1.1,2.9);
    }

    //    求长方形周长 方法
    public static void getRectangularPerimeter(double w, double h) {
        double result = 2 * (w + h);
        System.out.println(result);
    }
}
