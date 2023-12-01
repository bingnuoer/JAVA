package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
//        定义一个数组
        int[] arr = {1, 2, 3, 4, -5};

//        调用方法，求最大值-带参数的方法要赋值调用
        int arrMax = getArrMax(arr);
        System.out.println(arrMax);

    }

    public static int getArrMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
