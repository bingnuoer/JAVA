package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        double Rectangular1 = getRectangularArea(1.2, 2.1);
        double Rectangular2 = getRectangularArea(2.3, 1.8);
        String result = Rectangular1 > Rectangular2 ? "第一个长方形的面积是：" + Rectangular1 : "第二个长方形的面积是：" + Rectangular1;
        System.out.println(result);
    }

    //    方法-求长方形面积
    public static double getRectangularArea(double w, double h) {
        double area = w * h;
        return area;
    }
}
