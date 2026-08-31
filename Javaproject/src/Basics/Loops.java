package Basics;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int num;
		System.out.println("enter a number to print its table");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num +"*"+i+"="+num*i);
		}

	}

}
