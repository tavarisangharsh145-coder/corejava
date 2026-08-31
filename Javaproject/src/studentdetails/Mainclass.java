package studentdetails;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		StudentBeans std=new StudentBeans();
		
		System.out.println("ENTER STD ROLL NO:-");
		std.setStdrollno(sc.nextInt());
		System.out.println("ENTER STD NAME:-");
		std.setStdname(sc.next());
		System.out.println("ENTER STD FEES:-");
		std.setStdfees(sc.nextDouble());
		
		
		System.out.println("STD ROLL NO:-"+std.getstdrollno());
		System.out.println("STD NAME:-"+std.getStdname());
		System.out.println("STD FEES:-"+std.getStdfees());

	}

}
