public class VariableDemo2{
	public static void main(String[] args){
		/*1.基本用法
		定义变量，输出*/
		int a = 10;
		System.out.println(a);
		
		//2.变量参与计算
		int b = 20;
		int c = 30;
		System.out.println(a+b+c);
		
		//3.修改变量的值
		a = 60;
		System.out.println(a);
		
		System.out.println("-------------------------");
		
		//4.可以同时定义多个变量
		int d=100,e=200,f=300;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		//5.不能不给定义的变量赋值
		int g;
		g=500;
		System.out.println(g);
	}
}
	