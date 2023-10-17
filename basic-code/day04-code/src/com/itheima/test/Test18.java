package com.itheima.test;

public class Test18 {
    public static void main(String[] args) {
//        回文数
//        1.定义一个数
//        2.把这个数倒过来 和原始数 进行比较 一样-true
//                否则 false
        int x = 121;
//        定义临时变量，记录x初始值
        int temp = x;
//            记录x倒过来的数
        int num = 0;

//            不知道循环次数
        while (x != 0) {
//            从右往左获取每一位数
            int ge = x % 10; // ge=3
//             重新修改x
            x = x / 10; // x=12
//            把当前获取的数字拼接到最右边
            num = num * 10 + ge;
        }
        if (num == temp){
            System.out.println(temp + "是回文数");
        }else {
            System.out.println(temp + "不是回文数");
        }
    }
}
