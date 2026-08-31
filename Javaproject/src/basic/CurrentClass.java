package basic;

import java.util.Scanner;

public class CurrentClass {
	
	/*
	 variable are of 3 types:-
	 
	 
	 1.Global Variable -OR- Instance variable
	 variable which are declared outside the method but inside the class are called as global variable
	 
	 2.Local variable:-
	 Variable which are declared inside the method but not inside the static method are called as local variable
	 
	 3.Static variable
	 Variable which are declared with static keywords or declared inside the static methods or declared inside the main methods are called as static variable 
	 
	 */
	
	//Current class is class where we actual implement the program
	//SUB CLASS is class where we only call those program
	//Global variable or instance variable
	
	int empid;
	String empname;
	double empsal;
	
	public void setEmpDetails()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter EMP ID");
		empid=sc.nextInt();
		
		System.out.println("Enter EMP NAME:-");
		empname=sc.next();
		
		System.out.println("Enter EMP SALARY:-");
		empsal=sc.nextInt();
	}

	public void getEmpDetails()
	{
		System.out.println("EMP ID:-"+empid);
		System.out.println("EMP NAME:-"+empname);
		System.out.println("EMP SALARY:-"+empsal);
	}
	
	
	
	

}
