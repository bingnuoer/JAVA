//����¼����ϰ
//1.����
import java.util.Scanner;

public class ScannerTest1{
	public static void main(String[] args){
		//2.��������
		Scanner sc = new Scanner(System.in);
		
		//3.ʹ�ö���
		System.out.println("�������һ������");
		int number1 = sc.nextInt();
		
		System.out.println("������ڶ�������");
		int number2 = sc.nextInt();
		
		//���2����
		System.out.println(number1 + number2);
	}
}
