package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
//        直接调用
//        getSeasonIncomes(10,20,30); 空

//        赋值调用
        double sum1 = getSeasonIncomes(10,20,30);
        double sum2 = getSeasonIncomes(10,20,30);
        double sum3 = getSeasonIncomes(10,20,30);
        System.out.println(sum1+sum2+sum3);
        System.out.println(getSeasonIncomes(1,2,3));
    }

    //    方法-求每个季度的营业额
    public static double getSeasonIncomes(double num1, int num2, int num3) {
        double result = num1 + num2 + num3;
        return result;
    }
}
