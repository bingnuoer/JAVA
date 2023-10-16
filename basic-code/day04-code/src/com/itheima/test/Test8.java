package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        boolean isGreenLight = false;
        boolean isYelloLight = false;
        boolean isRedLight = true;

        if(isGreenLight){
            System.out.println("gogogo");
        } else if (isYelloLight) {
            System.out.println("等一等");
        } else if (isRedLight) {
            System.out.println("Stop!");
        }
    }
}
