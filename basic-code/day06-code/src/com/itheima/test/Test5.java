package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5};
        ergodicArr(Arr);
    }

    //    干什么？ 遍历数组
//    需要什么? 一个数组
//    需要调用返回值？ 不
    public static void ergodicArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}

