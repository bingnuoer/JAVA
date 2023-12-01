package com.itheima.methoddemo;

public class MethodDemo1 {
    //    主方法
    public static void main(String[] args) {
//        在主方法中使用方法
        PlayGame();
        System.out.println("-------------");
        PlayGame();

    }

    //定义的方法
    public static void PlayGame() {
        System.out.println("开始游戏");
        System.out.println("选英雄");
        System.out.println("拿人头");
        System.out.println("推水晶");
        System.out.println("胜利");

    }
}


