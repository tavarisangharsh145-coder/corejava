package basic;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("please enter two number");
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a==b)
		{
			System.out.println("Both are same");
		}
		else
		{
			 if(a>b)
			 {
				 System.out.println("a is greater");
			 }
			 else
				 System.out.println("b is greater");
		}
	}
}
