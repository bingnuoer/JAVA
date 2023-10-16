package com.itheima.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        int a = 1;
        a += 1;
        System.out.println(a);

        short s = 1;
        s += 1;
        //等价于 s = (short)(int(s)+1)
        System.out.println(s);
    }
}
