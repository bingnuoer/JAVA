package com.itheima.test;

public class Test7 {
    //    获取一个数，存到数组中，-> 进行后续加密操作
    public static void main(String[] args) {
//        1.获取一个数(可修改)
        int number = 1983;
        int temp = number; // 临时存储number的值，第三步用
        int count = 0; //number的长度

//        2.获取这个数的长度 -每次循环去掉最右边的数
        while (number != 0) {
            number = number / 10;
//            System.out.println(number);
            count++;
        }
//        System.out.println(count); //5

//        3.把number这个数存到数组
        int[] arr = new int[count];
        int index = arr.length-1;

//            获取number每一位数
        while (temp != 0) { //1 2 3 4 5
//                ge获取number最右边的数
            int ge = temp % 10;
//                去掉number最右边的数
            temp = temp / 10;
//            System.out.println(ge);// 5 4 3 2 1
//                存储到数组arr里
            arr[index] = ge; //   1  2  3 4 5
            index--; // index= 4 3 2 1 0
        }

//        4.加密

        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//            每位数加5
            arr[i] += 5; //元素+5
            arr[i] %= 10; //元素对10取余
        }

        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
//            数组元素反转
            int tempNum = arr[i];
            arr[i] = arr[j];
            arr[j] = tempNum;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        得到一串新数
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            num = num*10+arr[i];
        }
        System.out.println(num);
    }
}
