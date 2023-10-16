package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //1.键盘录入2个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数(0-10之间的整数)：");
        int number1 = sc.nextInt();

        System.out.println("请输入第2个数(0-10之间的整数)：");
        int number2 = sc.nextInt();
        //2.判断录入的数大小

        //3.判断2个数大小，输出
//        if(number1 > number2){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
        boolean result = number1 > number2;
        System.out.println(result);
    }
}
