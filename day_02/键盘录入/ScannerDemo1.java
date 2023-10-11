//键盘录入
//1.导包
import java.util.Scanner;

public class ScannerDemo1{
	public static void main(String[] args){
		//2.注册实例对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数");
		
		//3.接收数据
		int i = sc.nextInt();
		
		System.out.println(i);
	}
}