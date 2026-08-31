package basic;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Number which is divisible by itself
		//2,3,5,7,11,13
		int a=sc.nextInt();
		boolean flag=false;
		
		for(int i=10;i<=a/2;i++)
		{
			if(a%i==0)
			{
			  flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println(a+" is prime number");
		}
		else
		{
			System.out.println(a+" is not a prime number");
			
		}

	}

}
