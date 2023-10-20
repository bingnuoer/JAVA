package com.itheima.test;

import java.util.Random;

public class Test13 {
    public static void main(String[] args) {
//        随机打乱数组中的数据
//        循环 交换元素索引 0,1,2,3,4
        int[] arr = {1, 2, 3, 4, 5};
        int temp = 0;
        Random r = new Random();
//        循环遍历数组元素
        for (int i = 0; i < arr.length; i++) {
//            随机选择数组里面的一个索引
            int randomIndex = r.nextInt(arr.length);
//            当前元素 和 随机选择的元素 交换
            temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
