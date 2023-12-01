package com.itheima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*需求:
            个大V直播抽奖，奖品是现金红包，分别有{2，588，888, 1000, 10000}五个奖金。
            请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
            打印效果如下: (随机顺序， 不一定是下面的顺序)
            888元的奖金被抽出
            588元的奖金被抽出
            10000元的奖金被抽出
            1000元的奖金被抽出
            2元的奖金被抽出.
        */
//        1、奖金池数组
        int[] arr = {2, 588, 888, 1000, 10000};
//       /2、判断重复的新数组
        int[] newArr = new int[arr.length];
//        随机生成一个索引，把这个元素添加到新数组中。
//        判断新数组中是否存在抽中的元素，存在-重复了，再抽；不存在-没重复，打印
        Random r = new Random();
//      /3、 抽奖
        for (int i = 0; i < arr.length; ) {
//            获取随机索引
            int randomIndex = r.nextInt(arr.length); //[0~(arr.length-1)]
//            System.out.println(arr[randomIndex]);
//                奖项

            int awards = arr[randomIndex];
//            判断第i次抽取的奖是否重复
            boolean flag = isRepeat(newArr,awards);
//          奖项不重复
            if(!flag){
//                把本次奖项存到新数组
                newArr[i] = arr[randomIndex];
//                i不变，不能跳过i
//                添加完毕，移动索引
                i++;
            }
        }

        //            输出抽出的奖项顺序
        for (int j = 0; j < newArr.length; j++) {
            System.out.println(newArr[j]);
        }

    }

//    判断抽取的奖是否重复 - 方法
    public static boolean isRepeat(int[] newArr,int awards) {
        for (int i = 0; i < newArr.length; i++) {
            if(awards == newArr[i]){
                return true;
            }
        }
        return false;
    }
}
