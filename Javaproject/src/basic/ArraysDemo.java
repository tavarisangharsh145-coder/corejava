package basic;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Core java");
		//Array is collection of multiple elements
		// 0,1,2,3,4
		int a[]= {12,3,4,5,6,78,8,9,67,34,78};
		System.out.println("Length:"+a.length);
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Position"+i+"Value"+a[i]);
		}
		
		// with user input
		
		System.out.println("Enter the Length");
		int h=sc.nextInt();
		
		int b[]=new int[h];
		System.out.println("Enter the Length");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Position"+i+"Value"+b[1]);
		}

	}

}
