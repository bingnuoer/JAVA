//定义一个方法，循环判断数组中的某一个数是否存在，将结果返回给调用处
package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 61, 89, 100};
//        调用方法
        boolean flag = contains(arr, 120);
        System.out.println(flag);
    }


    //    方法
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
//        等循环遍历结束，才知道是否是数组里的数
        return false;
    }
}
