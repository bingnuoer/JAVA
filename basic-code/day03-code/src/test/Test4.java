package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("请输入第2只老虎的体重");
        int weight2 = sc.nextInt();

//        boolean result = weight1 == weight2 ;

        String result = weight1 == weight2 ? "相同" : "不同";
        System.out.println(result);
    }
}
