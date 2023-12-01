package com.itheima.test;

public class Test8 {
    //    解密
    public static void main(String[] args) {
//        创建数组
        int[] arr = {8, 3, 4, 6};
//        1.反转 6 3 4 8
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
//        2.加密是对数字10取余得到，求余数前-第二行数字范围5-14
//        对10取余 解密时候判断：0-4之间加10,5-9不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

//        3.减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }

//        拼接成新数字
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
