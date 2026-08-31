package basic;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5 = 1*2*3*4*5= 120
		int a=5, f=1;
		//      i=6 6<=5
		for(int i=1;i<=a;i++)
		{
			f=f*i; // f=24*5, f=120
		}
		System.out.println("Factorial of "+a+" is " + f);

	}

}
