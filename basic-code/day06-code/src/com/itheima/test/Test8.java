package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] ints = copyOfRange(arr, 3, 7);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
    }

    public static int[] copyOfRange(int[] arr,int from,int to) {
        int[] newArr = new int[to-from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
