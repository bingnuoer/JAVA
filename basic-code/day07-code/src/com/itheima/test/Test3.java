package com.itheima.test;

import java.util.Random;

public class Test3 {
    //    定义方法实现随机产生一个5位的验证码:1~4位是字符，第5位是数字
//    把字母a-z存到数组
    public static void main(String[] args) {
//        1.准备 字符数组
        char[] chs = new char[52];
//        存数组
        for (int i = 0; i < chs.length; i++) {
//            ASCII表
            if (i <= 25) {
                // 小写字母
                chs[i] = (char) (97 + i);
            } else {
                // 大写字母
                chs[i] = (char) (65 + i - 26);
            }

        }

//        2.字符-随机抽取4次
//        随机数，随机抽取一个索引
        Random r = new Random();
//        定义一个空字符串，把4个随机数拼接起来
        String result = "";

        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length); // 0-51
//        利用随机数，随机生成一个索引-获取对应的元素
//            System.out.println(chs[randomIndex]);
//        3. 把4个随机数拼接起来
            result = result + chs[randomIndex];
        }
//        System.out.println(result);

//        4.随机抽取1位数字
        int numberIndex = r.nextInt(10); // 0-9
//        System.out.println(numberIndex);
//        拼接到字符串上
        result = result + numberIndex;
        System.out.println(result);

//        输出数组
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]+" ");
//        }

    }
}
