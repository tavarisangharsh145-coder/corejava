 package basic;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		// string is non primitive data type
		
		String a="have a good day";
		String b="Have a good day";
		for (int i=0;i<a.length();i++)
		{
			System.out.println("Position"+i +"Value"+a.charAt(i));
		}
		if(a.equals(b))
		{
			System.out.println("Match found");
		}
		else
		{
			System.out.println("Match found..");
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Enter your name:-");
			String n=sc.nextLine();
			
			//next() is defined of scanner class
			// it is used to store only first single word inside the variable
			
			//nextLine() is predefined method of Scanner class
			//it is used to store multiple words and paragraph inside the variable
			
			
			System.out.println("Welcome"+ n);
			String str="Job placement at Mumbai"; 
			System.out.println(str.replace("Mumbai","Pune"));
			String str1="core java with Automation";
			
			// replace() is predefined method of string
			//it is used to replace old data with the new dataa
			
			//trim is predefined method of string
			//it is used to extra space given at the start from the string
			System.out.println(str1);
			System.out.println(str1.trim());
			
			
			
		}
 
	}

}
