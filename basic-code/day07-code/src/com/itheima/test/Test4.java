package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
//        把一个数组的元素复制到另一个新数组
//        老数组
        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        新数组
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
//            难点：i 是老数组索引，新数组索引
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
