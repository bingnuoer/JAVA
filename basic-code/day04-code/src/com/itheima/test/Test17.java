package com.itheima.test;

public class Test17 {
    public static void main(String[] args) {
//        1.定义山的高度
        double height = 8844430;
//       2.定义纸张的初始厚度
        double paper = 0.1;
//        3.定义折叠次数
        int count = 0;
        while (paper < height) {
//            每折叠一次，纸张厚度*2
            paper *= 2;
//            折叠次数++
            count++;
        }
        System.out.println(count);
    }
}
