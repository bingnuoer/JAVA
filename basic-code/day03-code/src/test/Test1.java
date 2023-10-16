package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //1.键盘导入
        //创建对象
        Scanner sc = new Scanner(System.in);
        //使用对象,赋值给一个新的变量
        int number = sc.nextInt();

        //2.输出个、十、百位
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
    }
}
