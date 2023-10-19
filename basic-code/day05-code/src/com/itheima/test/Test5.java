package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
//        1.生成任意随机数
//        1~100
        Random r = new Random();
        /*
        首尾-第一个数：0~99
            尾+1:100（就是范围）
            给范围后 再加第一个减去的数
            */
        int number = r.nextInt(100) + 1; //0~99 +1  1~100 生成的随机数

//        2.输入猜的数字
        Scanner sc = new Scanner(System.in);


//        4.循环判断，一直猜
        while (true){
            System.out.println("请输入你要猜的数字");
            int gessNumber = sc.nextInt(); //要猜的数字

//            3.判断
            if(gessNumber > number){
                System.out.println("猜大了");
            } else if (gessNumber < number) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜，猜中了！");
                break; // 结束循环
            }
        }
//

    }
}
