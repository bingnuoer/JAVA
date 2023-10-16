package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
//        定义要吃的面
        String nuddle = "陕西油泼面";

//        匹配
        switch (nuddle){
            case"兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case"武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case"陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            case"北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            default:
                System.out.println("吃方便面");
        }
    }
}
