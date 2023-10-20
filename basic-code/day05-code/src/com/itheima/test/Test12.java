package com.itheima.test;

public class Test12 {
    public static void main(String[] args) {
/*//        1. 存入数组
        int[] arr = {1, 2, 3, 4, 5};
//        2. 交换元素
        int temp = 0; // 临时变量
//        交换
        temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
//        打印交换后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

//        交换数组首尾元素——数组元素倒着存储
        int[] arr = {1, 2, 3, 4, 5};
        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr [j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
