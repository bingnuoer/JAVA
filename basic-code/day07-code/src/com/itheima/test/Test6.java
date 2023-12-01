package com.itheima.test;

public class Test6 {
    /*
    某系统的数字密码(大于0)。比如1983，采用加密方式进行传输，
    规则如下:
    每位数加上5
    再对10求余，
    最后将所有数字反转，
    得到一串新数。*/

    public static void main(String[] args) {
//        把数放在数组中进行操作

//        1.创建数组
        int[] arr = {1, 9, 8, 3};

//        2.加密
//        每位数加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //        再对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
//        最后将所有数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            数组头尾元素交换
            int temp = arr[i]; //临时变量
            arr[i] = arr[j];
            arr[j] = temp;
        }

//        3.得到新数
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
//            System.out.println(number);
        }
        System.out.println(number);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }


}
