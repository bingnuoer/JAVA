package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[θ - 100]之间的整数。
        //选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

//        1. 分数数组：键盘录入 6个分数->存入数组  --封装方法
//        定义一个数组，存储评委的打分
        int[] getScoreArr = getScores();
        for (int i = 0; i < getScoreArr.length; i++) {
            System.out.println(getScoreArr[i]);
        }

//        2.数组最大值  --封装方法
        int max = getMax(getScoreArr);
//        3.数组最小值  --封装方法
        int min = getMin(getScoreArr);
//        4.求数组元素总和  --封装方法
        int sum = getSum(getScoreArr);
//        5.(分数数组元素求和-最大值-最小值)/4
//        数组元素数量不要写死
        double aver = (sum - max - min) / (getScoreArr.length-2);
        System.out.println("选手最终得分是：" + aver);
    }

    //    方法：
//    需要什么？
//    返回什么？

    //    方法：求数组元素和
    public static int getSum(int[] getScoreArr) {
        int sum = 0;
        for (int i = 0; i < getScoreArr.length; i++) {
            sum = sum + getScoreArr[i];
        }
        return sum;
    }

    //    方法：求数组最大值
    public static int getMax(int[] getScoreArr) {
//        默认最大值是数组第1个元素
        int max = getScoreArr[0];
//        从数组第2个元素开始比较
        for (int i = 1; i < getScoreArr.length; i++) {
            if (max < getScoreArr[i]) {
//                更新最大值
                max = getScoreArr[i];
            }
        }
        return max;
    }

    //    方法：求数组最小值
    public static int getMin(int[] getScoreArr) {
//        默认最小值是数组第1个元素
        int min = getScoreArr[0];
//        从数组第2个元素开始比较
        for (int i = 1; i < getScoreArr.length; i++) {
            if (min > getScoreArr[i]) {
//                更新最大值
                min = getScoreArr[i];
            }
        }
        return min;
    }

    //    方法：键盘录入 分数 ->返回数组
    public static int[] getScores() {
        int[] scoreArr = new int[6];
//        键盘录入
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scoreArr.length; ) {
            System.out.println("请输入评分：");
            int score = sc.nextInt();
//            判断成绩范围，成绩符合范围就录入，不符合范围就一直让输入成绩
            if (score >= 0 && score <= 100) {
                scoreArr[i] = score;
//                只有成绩符合范围，录入之后才跳过当前i,执行i++
                i++;
            } else {
                System.out.println("成绩超出范围，请重新录入！当前索引i=" + i);
            }

        }

        return scoreArr;
    }
}
